package Class;

public interface IPersonnel
{
    enum ESector
    {
        UNDEFINED,
        UNASSIGNED
    }

    enum EPosition
    {
        UNDEFINED,
        UNASSIGNED,
        ADMIN,
        EMPLOYEE,
    }

    ESector GetSector();
    EPosition GetPosition();
    //string GetFirstName();
    //string GetLastName();
}
