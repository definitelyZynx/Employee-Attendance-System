package classes;

public class CInfoPersonal
{
    public CInfoPersonal(CEmployee DataOwner_, String FirstName_, String LastName_, int Age_)
    {
        this.DataOwner  = DataOwner_;
        this.FirstName  = FirstName_;
        this.LastName   = LastName_;
        this.Age        = Age_;
    }
    
    public boolean ModifyValues(CEmployee Requester, String FirstName_, String LastName_, int Age_)
    {
        // Check priviledge
        if (Requester != this.DataOwner) // only check for priviledge if the requester is not the data owner, otherwise freely allow the data owner to modify their own basic info
            if (!Requester.Privilege.HasPriviledge(this.ReqPrivWrite)) // check if the requester has priviledge to write
                return false;
        
        if (FirstName_ != null)
            this.FirstName = FirstName_;
        
        if (LastName_ != null)
            this.LastName = LastName_;
        
        if (Age_ > 0)
            this.Age = Age_;
        
        return true;
    }
    
    public String[] GetNames()
    {
        return new String[] { this.FirstName, this.LastName };
    }
    
    public int GetAge()
    {
        return this.Age;
    }
    
    private CEmployee DataOwner = null;
    
    private String FirstName = null;
    private String LastName  = null;
    private int    Age       = 0;
    
    private final CPrivilege ReqPrivWrite = new CPrivilege(CPrivilege.CHANGE_BASIC_INFO);
}
