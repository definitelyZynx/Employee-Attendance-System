package classes;

public class CEmployee
{    
    
    public CEmployee(CInfoPersonal Personal_, CInfoEmployment Employment_, CPrivilege Privilege_)
    {
        this.Personal   = Personal_;
        this.Employment = Employment_;
        this.Privilege  = Privilege_;
    }

    public CInfoPersonal   Personal;
    public CInfoEmployment Employment;
    public CInfoAttendance Attendance;
    public CPrivilege      Privilege;
}
