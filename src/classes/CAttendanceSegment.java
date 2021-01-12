package classes;

import java.util.Date;

public class CAttendanceSegment
{
    CAttendanceSegment()
    {
        this.Date  = new Date();
        this.State = false;
    }
    
    CAttendanceSegment(boolean State_)
    {
        this.Date  = new Date();
        this.State = State_;
    }
    
    CAttendanceSegment(Date Date_, boolean State_)
    {
        this.Date  = Date_;
        this.State = State_;
    }
        
    public Date    Date  = null;
    public boolean State = false; // just for integrity check to make sure
}
