import java.io.File;
import java.util.*;
public class Bai3 {
    public static void main(String[] args) throws Exception{
        Scanner sc= new Scanner(new File("VANBAN.in"));
        Set<String> a= new TreeSet<>();
        while(sc.hasNextLine())
        {
            String s= sc.next();
            int check=0;
            for(int i=0; i<s.length(); i++)
            {
                if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
                {
                    check=1;
                }
            }
            if(check == 0)
            {
                a.add(s);
            }
        }
        for(String x : a)
        {
            System.out.println(x);
        }
    }
}
