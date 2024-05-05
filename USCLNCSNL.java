import java.util.*;
import java.math.BigInteger;
public class USCLNCSNL {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int t= Integer.parseInt(sc.nextLine());
        while(t-- >0)
        {
            BigInteger a= new BigInteger(sc.nextLine());
            BigInteger b= new BigInteger(sc.nextLine());
            System.out.println(a.gcd(b));
        }
    }
}
