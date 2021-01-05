package classes;

public class CPriviledge
{
    public static final int NONE                   = 0;
    public static final int TIME_IN                = 1;
    public static final int TIME_OUT               = 1 << 1;
    public static final int CHANGE_PASSWORD        = 1 << 2;
    public static final int ACCESS_BASIC_INFO      = 1 << 3;
    public static final int MODIFY_ATTENDANCE_DATA = 1 << 4;
    public static final int CHANGE_BASIC_INFO      = 1 << 5;
    public static final int CHANGE_EMPLOYMENT_INFO = 1 << 6;
    
    public CPriviledge(int Flags)
    {
        this.Flag = Flags;
    }
    
    public CPriviledge GetAllPriviledge()
    {
        return new CPriviledge(this.Flag);
    }
    
    public boolean HasPriviledge(CPriviledge PriviledgeFlag)
    {
        return (this.Flag & PriviledgeFlag.Flag) > 0;
    }
    
    public boolean HasPriviledge(int PriviledgeFlag)
    {
        return (this.Flag & PriviledgeFlag) > 0;
    }
    
    private int Flag = CPriviledge.NONE;
}
