package classes;

public class CPrivilege
{
    public static final int NONE                   = 0;
    public static final int TIME_IN                = 1;
    public static final int TIME_OUT               = 1 << 1;
    public static final int CHANGE_PASSWORD        = 1 << 2;
    public static final int ACCESS_BASIC_INFO      = 1 << 3;
    public static final int MODIFY_ATTENDANCE_DATA = 1 << 4;
    public static final int CHANGE_BASIC_INFO      = 1 << 5;
    public static final int CHANGE_EMPLOYMENT_INFO = 1 << 6;
    
    public CPrivilege(int Flags)
    {
        this.Flag = Flags;
    }
    
    public CPrivilege GetAllPriviledge()
    {
        return new CPrivilege(this.Flag);
    }
    
    public boolean HasPriviledge(CPrivilege PriviledgeFlag)
    {
        return (this.Flag & PriviledgeFlag.Flag) > 0;
    }
    
    public boolean HasPriviledge(int PriviledgeFlag)
    {
        return (this.Flag & PriviledgeFlag) > 0;
    }
    
    private int Flag = CPrivilege.NONE;
}
