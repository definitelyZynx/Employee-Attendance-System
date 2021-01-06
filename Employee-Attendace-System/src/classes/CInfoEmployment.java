package classes;

public class CInfoEmployment
{
    public CInfoEmployment(String IDCode_, String Password_, CSector Sector_)
    {
        this.IDCode   = IDCode_;
        this.Password = Password_;
        this.Sector   = Sector_;
    }
    
    public boolean ModifyValues(CEmployee Requester, String IDCode_, String Password_, CSector Sector_)
    {
        if (!Requester.Priviledge.HasPriviledge(this.ReqPrivWrite))
            return false;
            
        if (IDCode_ != null)
            this.IDCode = IDCode_;
        
        if (Password_ != null)
            this.Password = Password_;
        
        if (Sector_ != null)
            this.Sector = Sector_;
            
        return true;
    }
    
    public String GetIDCode(CEmployee Requester)
    {
        if (!Requester.Priviledge.HasPriviledge(this.ReqPrivRead))
            return null;
        
        return this.IDCode;
    }
    
    public String GetPassword(CEmployee Requester)
    {
        if (!Requester.Priviledge.HasPriviledge(this.ReqPrivRead))
            return null;
        
        return this.Password;
    }
    
    public CSector GetSector(CEmployee Requester)
    {
        if (!Requester.Priviledge.HasPriviledge(this.ReqPrivRead))
            return null;
        
        return this.Sector;
    }
    
    // Used for checking credentials
    // Since there's no reads or writes allowed outside the class unless a requester with sufficient priviledge is provided
    public boolean CheckCredentials(String IDCode_, String Password_)
    {
        if (IDCode_  == null &&  Password_ == null // make sure that the function is provided with atleast one or two valid arguments to check
        ||  IDCode_  != null && !IDCode_.equals(this.IDCode) // allows the function to only check for idcode match
        ||  Password != null && !Password_.equals(this.Password) // allows the function to only check for password match
        ) {
            return false;
        }
        
        return true;
    }
    
    private String  IDCode   = null;
    private String  Password = null;
    private CSector Sector   = null;
    
    private final CPrivilege ReqPrivRead  = new CPrivilege(CPrivilege.ACCESS_EMPLOYMENT_INFO);
    private final CPrivilege ReqPrivWrite = new CPrivilege(CPrivilege.CHANGE_EMPLOYMENT_INFO);
}
