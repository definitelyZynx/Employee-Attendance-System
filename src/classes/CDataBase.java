package classes;

import Helpers.Utils;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CDataBase
{
    public CDataBase()
    {
    }
    
    public CEmployee ChallengeAuthentication(String IDCode, String Password)
    {
        for (Map.Entry<String, CEmployee> EmployeeKVP : this.Employees.entrySet())
            if (EmployeeKVP.getValue().Employment.CheckCredentials(IDCode, Password))
                return EmployeeKVP.getValue();
        
        return null;
    }
    
    public final void EmployeeRegister(String FirstName, String LastName, int Age, String IDCode, String Password, int Sector, int Privilege)
    {
        String Identifier = Utils.GenerateRandomString();
        this.Employees.put(Identifier, new CEmployee(Identifier, new CInfoPersonal(null, FirstName, LastName, Age), new CInfoEmployment(IDCode, Password, new CSector(Sector)), new CPrivilege(Privilege)));
    }
    
    public void EmployeeRemove(String Identifier)
    {
        this.Employees.remove(Identifier);
    }
    
    public void EmployeeRemove(CEmployee Employee)
    {
        this.Employees.remove(Employee.GetIdentifier());
    }
    
    public CEmployee EmployeeGet(String Identifier)
    {
        return this.Employees.get(Identifier);
    }
    
    // TODO: DataLoadToTable - load all the info into a JTable or something similar
    
    public final boolean SaveToFile()
    {
        try
        {
            try (FileWriter fw = new FileWriter("database.json"))
            {
                fw.write(gson.toJson(this, CDataBase.class));
            }
            return true;
        } catch (IOException ex)
        {
            Logger.getLogger(CDataBase.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public final boolean LoadFromFile()
    {
        if (!(new File("database.json").isFile()))
            return false;
            
        try
        {
            CDataBase loaded_db = gson.fromJson(Files.readString(Paths.get("database.json")), CDataBase.class);
            this.Employees = loaded_db.Employees;
            return true;
        } catch (IOException ex)
        {
            Logger.getLogger(CDataBase.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public final int CountEmployees()
    {
        return this.Employees.size();
    }
    
    private HashMap<String, CEmployee> Employees = new HashMap<>();
    private final transient Gson       gson      = new Gson();
}