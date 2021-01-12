package classes;

public class CEmployee
{    
    
    public CEmployee(String Identifier_, CInfoPersonal Personal_, CInfoEmployment Employment_, CPrivilege Privilege_)
    {
        this.Identifier = Identifier_;
        this.Personal   = Personal_;
        this.Employment = Employment_;
        this.Privilege  = Privilege_;
    }

    public String GetIdentifier()
    {
        return this.Identifier;
    }
    
    private String          Identifier = null;
    public  CInfoPersonal   Personal;
    public  CInfoEmployment Employment;
    public  CAttendance     Attendance = new CAttendance();
    public  CPrivilege      Privilege;
}
