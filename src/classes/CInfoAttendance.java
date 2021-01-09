package classes;

import java.util.ArrayList;
import java.util.Date;

public class CInfoAttendance
{
    public enum AttendanceState
    {
        NONE,
        TIME_IN,
        TIME_OUT,
        FINISHED
    }
    
    public void TimeIn()
    {
        this.Attendance.add(new CAttendanceData(AttendanceState.TIME_IN));
    }
    
    public void TimeOut()
    {
        this.Attendance.add(new CAttendanceData(AttendanceState.TIME_OUT));
    }
    
    public AttendanceState GetAttendanceState()
    {
        if (Attendance.isEmpty())
            return AttendanceState.TIME_IN;
        
        CAttendanceData LastEntry = Attendance.get(Attendance.size() - 1);
        
        if (LastEntry.State == AttendanceState.TIME_OUT && new Date().after(LastEntry.Date)) // Let the user timein when the last entry is a timeout and a day has passed
            return AttendanceState.TIME_IN;
            
        if (LastEntry.State == AttendanceState.TIME_IN) // Make the user timeout when the last entry was a timein
            return AttendanceState.TIME_OUT;
        
        return AttendanceState.FINISHED; // Cant timein or timeout if the user has filled the quota for today
    }
    
    private ArrayList<CAttendanceData> Attendance = new ArrayList<>();
}
