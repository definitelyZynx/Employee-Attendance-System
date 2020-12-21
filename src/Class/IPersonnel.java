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
    boolean SetFirstName(String value);
    boolean SetLastName(String value);
}
