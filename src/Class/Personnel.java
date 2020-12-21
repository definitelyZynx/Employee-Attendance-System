package Class;

public class Personnel implements IPersonnel
{
    String    FirstName = "",
              LastName  = "",
              IDCode    = "";

    ESector   Sector    = ESector.UNASSIGNED;
    EPosition Position  = EPosition.UNASSIGNED;

    public ESector GetSector()
    {
        return ESector.UNDEFINED; // Force undefined since this class is made to be extended
    }
    public EPosition GetPosition()
    {
        return EPosition.UNDEFINED; // Force undefined since this class is made to be extended
    }
}
