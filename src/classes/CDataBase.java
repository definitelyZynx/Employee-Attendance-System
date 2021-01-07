package classes;

import com.google.gson.Gson;
import java.util.ArrayList;

public class CDataBase
{
    public CEmployee ChallengeAuthentication(String IDCode, String Password)
    {
        for (CEmployee Employee : EmployeeList)
            if (Employee.Employment.CheckCredentials(IDCode, Password))
                return Employee;
        
        return null;
    }
    
    public boolean SaveToFile()
    {
        String serialized = gson.toJson(this, CDataBase.class);
        
        return true;
    }
    
    private CEmployee            MasterUser   = null;
    private ArrayList<CEmployee> EmployeeList = new ArrayList<CEmployee>();
    private transient Gson       gson         = new Gson();
}