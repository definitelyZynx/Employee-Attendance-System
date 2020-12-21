package Class;

public class Admin extends Personnel
{
    @Override
    public ESector GetSector()
    {
        return this.Sector;
    }

    @Override
    public EPosition GetPosition()
    {
        return EPosition.ADMIN;
    }
}
