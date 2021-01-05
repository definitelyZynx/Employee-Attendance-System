package classes;

public class CEmployee
{    
    
    public CEmployee(CInfoPersonal Personal_, CInfoEmployment Employment_, CPriviledge Priviledge_)
    {
        this.Personal   = Personal_;
        this.Employment = Employment_;
        this.Priviledge = Priviledge_;
    }

    public CInfoPersonal   Personal;
    public CInfoEmployment Employment;
    public CInfoAttendance Attendance;
    public CPriviledge     Priviledge;
}
