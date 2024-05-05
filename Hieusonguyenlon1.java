import java.util.*;
import java.math.BigInteger;
public class Hieusonguyenlon1 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int t= Integer.parseInt(sc.next());
        while(t-- >0)
        {
            BigInteger x= new BigInteger(sc.next());
            BigInteger y= new BigInteger(sc.next());
            String s= String.valueOf(x.subtract(y).abs());
            int max= Math.max(String.valueOf(x).length(), String.valueOf(y).length());
            while(s.length() < max)
            {
                s= '0' + s;
            }
            System.out.println(s);
        }
    }
}
