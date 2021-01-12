package classes;

public class CAttendanceData
{
    public CAttendanceData()
    {
        
    }
    
    public CAttendanceSegment[] GetByDate(int Month, int Date)
    {
        return this.Segments[Month][Date];
    }
    
    public CAttendanceSegment[][][] Segments = new CAttendanceSegment[12][31][2];
}
