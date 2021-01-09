package helper;

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
}
