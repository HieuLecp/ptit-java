import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Logthoigian {
    static boolean check(String s)
    {
        if(s.length()!=8)
            return false;
        if(s.charAt(2) != ':' || s.charAt(5) != ':')
            return false;
        for(int i=0; i<8; i++)
        {
            if(i != 2 && i != 5 && !Character.isDigit(s.charAt(i)))
                return false;
        }
        int gio= Integer.parseInt(s.substring(0, 2)), phut= Integer.parseInt(s.substring(3, 5)), giay= Integer.parseInt(s.substring(6, 8));
        return gio<24 && phut<60 && giay<60;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        TreeSet<String> se= new TreeSet<>();
        while(sc.hasNextLine())
        {
            String s= sc.nextLine();
            String[] x= s.split("\\s|\\.|\\,");
            for(String i:x)
            {
                if(check(i))
                    se.add(i);
            }
        }
        for(String i:se)
            System.out.println(i);
    }
}
