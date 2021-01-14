package classes;

import helper.Utils;
import java.util.HashMap;

public class CAttendance
{
    public static final int NONE     = -2;
    public static final int FINISHED = -1;
    public static final int TIME_IN  =  0;
    public static final int TIME_OUT =  1;
    
    public void CheckThisYear()
    {
        int year = Utils.GetDateDMY()[2];
        
        if (!this.YearlyAttendance.containsKey(year))
        {
            this.YearlyAttendance.put(year, new CAttendanceData());
        }
        
    }
    
    public CAttendanceData GetThisYear()
    {
        int year = Utils.GetDateDMY()[2];
        CheckThisYear();
        return this.YearlyAttendance.get(year);
    }
    
    public CAttendanceSegment[] GetThisToday()
    {
        int now[] = Utils.GetDateDMY();
        CheckThisYear();
        return this.YearlyAttendance.get(now[2]).GetByDate(now[1] - 1, now[0] - 1);
    }
    
    public void TimeEmployee(int Method)
    {
        this.GetThisToday()[Method] = new CAttendanceSegment(true);
    }
    
    public int GetAttendanceState()
    {
        CAttendanceSegment[] TodayAttendance = this.GetThisToday();
        
        if (TodayAttendance[CAttendance.TIME_IN] == null)
            return CAttendance.TIME_IN;
        
        if (TodayAttendance[CAttendance.TIME_OUT] == null)
            return CAttendance.TIME_OUT;
        
        if (TodayAttendance[CAttendance.TIME_IN].State && TodayAttendance[CAttendance.TIME_OUT].State)
            return CAttendance.FINISHED;
        
        // integrity fallback checks 
        
        if (TodayAttendance[CAttendance.TIME_IN].State)
            return CAttendance.TIME_OUT;
        
        return CAttendance.TIME_IN;
    }
    
    public HashMap<Integer, CAttendanceData> GetAllAttendance()
    {
        return YearlyAttendance;
    }
    
    private HashMap<Integer, CAttendanceData> YearlyAttendance = new HashMap<>()
    {
        
    };
    
}
