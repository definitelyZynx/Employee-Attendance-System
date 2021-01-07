package classes;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CDataBase
{
    public CDataBase()
    {
        this.RegisterEmployee("Jane", "Duo", 20, "0000", "1234", 0, CPrivilege.TIME_IN);
    }
    
    public CEmployee ChallengeAuthentication(String IDCode, String Password)
    {
        for (CEmployee Employee : EmployeeList)
            if (Employee.Employment.CheckCredentials(IDCode, Password))
                return Employee;
        
        return null;
    }
    
    public void RegisterEmployee(String FirstName, String LastName, int Age, String IDCode, String Password, int Sector, int Privilege)
    {
        this.EmployeeList.add(new CEmployee(new CInfoPersonal(null, FirstName, LastName, Age), new CInfoEmployment(IDCode, Password, new CSector(Sector)), new CPrivilege(Privilege)));
    }
    
    public void SaveToFile() throws IOException
    {
        FileWriter fw = new FileWriter("database.json");
        fw.write(gson.toJson(this, CDataBase.class));
        fw.close();
    }
    
    private ArrayList<CEmployee> EmployeeList = new ArrayList<CEmployee>();
    private transient Gson       gson         = new Gson();
}