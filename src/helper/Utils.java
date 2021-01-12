package helper;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class Utils
{
    static final Random RngInstance = new Random();
    
    public static String GenerateRandomString()
    {
        return GenerateRandomString(8);
    }
    
    public static String GenerateRandomString(int Length)
    {
        return GenerateRandomString(Length, "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
    }
    
    public static String GenerateRandomString(int Length, String CharSet)
    {
        String Result = "";
        
        for (int i = 0; i < Length; i++)
            Result += CharSet.charAt(RngInstance.nextInt(CharSet.length() - 1));
        
        return Result;
    }
    
    public static int[] GetDateDMY()
    {
        Calendar CalendarInst = new GregorianCalendar();
        return new int[] { CalendarInst.get(Calendar.DATE), CalendarInst.get(Calendar.MONTH) + 1, CalendarInst.get(Calendar.YEAR) };
    }
}
