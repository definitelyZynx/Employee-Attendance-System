package classes;

import java.util.Date;

public class CAttendanceData
{
    CAttendanceData() {}
    
    CAttendanceData(CInfoAttendance.AttendanceState State_)
    {
        this.State = State_;
    }
    
    public Date Date = new Date();
    public CInfoAttendance.AttendanceState State = CInfoAttendance.AttendanceState.NONE;
}
