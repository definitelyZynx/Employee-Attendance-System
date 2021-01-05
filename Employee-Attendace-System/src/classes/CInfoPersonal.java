package classes;

public class CInfoPersonal
{
    public CInfoPersonal(CEmployee DataOwner_, String FirstName_, String LastName_, int Age_)
    {
        this.FirstName  = FirstName_;
        this.LastName   = LastName_;
        this.Age        = Age_;
    }
    
    private CEmployee DataOwner = null;
    
    private String FirstName = null;
    private String LastName  = null;
    private int    Age       = 0;
    
    private final CPriviledge ReqPrivRead  = new CPriviledge(CPriviledge.NONE);
    private final CPriviledge ReqPrivWrite = new CPriviledge(CPriviledge.CHANGE_BASIC_INFO);
}
