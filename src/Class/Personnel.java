package Class;

public class Personnel implements IPersonnel
{
    public Personnel(ESector Sector_, EPosition Position_)
    {
        this.Sector   = Sector_;
        this.Position = Position_;
    }

    private String FirstName = "",
                   LastName  = "",
                   IDCode    = "";
    ESector        Sector    = ESector.UNDEFINED;
    EPosition      Position  = EPosition.UNDEFINED;

    public boolean SetFirstName(String value)
    {
        if (this.GetPosition() != EPosition.ADMIN)
            return false;

        this.FirstName = value;
        return true;
    }

    public boolean SetLastName(String value)
    {
        if (this.GetPosition() != EPosition.ADMIN)
            return false;

        this.LastName = value;
        return true;
    }

    public ESector GetSector()
    {
        return this.Sector;
    }

    public EPosition GetPosition()
    {
        return this.Position;
    }
}
