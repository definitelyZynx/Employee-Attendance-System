package helper;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import javax.swing.JFrame;

public class Utils
{
    
    public static final String[] DayToText = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
    
    public static final Random RngInstance = new Random();
    
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
    
    public static void CenterForm(JFrame Form)
    {
        Dimension DisplaySize = Toolkit.getDefaultToolkit().getScreenSize();
        Form.setLocation((int)(DisplaySize.getWidth() / 2 - Form.getWidth() / 2), (int)(DisplaySize.getHeight() / 2 - Form.getHeight() / 2));
    }
}
