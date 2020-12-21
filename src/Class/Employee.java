package Class;

public class Employee extends Personnel
{
    @Override
    public ESector GetSector()
    {
        return this.Sector;
    }

    @Override
    public EPosition GetPosition()
    {
        return EPosition.EMPLOYEE;
    }
}
