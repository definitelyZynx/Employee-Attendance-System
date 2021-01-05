package classes;

public class CEmployee
{    
    enum ESector
    {
        NONE,
    }
    
    public CEmployee(String FirstName_, String LastName_, int Age_, ESector Sector_, String IDCode_, CPriviledge Priviledge_)
    {
        this.FirstName  = FirstName_;
        this.LastName   = LastName_;
        this.Age        = Age_;
        this.Sector     = Sector_;
        this.IDCode     = IDCode_;
        this.Priviledge = Priviledge_;
    }
    
    // Personal Information
    private String FirstName = null;
    private String LastName  = null;
    private int    Age       = 0;
    
    // Employment info
    private ESector Sector = ESector.NONE; 
    private String  IDCode = null;
    
    // Attendance Info
    
    
    // Access Info
    private CPriviledge Priviledge;
}
