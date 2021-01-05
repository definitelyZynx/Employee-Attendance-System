package classes;

public class CEmployee
{
    enum EPriviledge
    {
        NONE,
    }
    
    enum ESector
    {
        NONE,
    }
    
    // Personal Information
    private String FirstName = null;
    private String LastName  = null;
    private int    Age       = 0;
    
    // Employment info
    private ESector Sector = ESector.NONE; 
    private String  IDCode = null;
    
    // Access Info
    private EPriviledge Priviledge = EPriviledge.NONE;
}
