import java.math.BigInteger;
import java.util.*;
public class Boisochungnhonhat {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int t= Integer.parseInt(sc.nextLine());
        while(t-- >0)
        {
            BigInteger a = new BigInteger(sc.nextLine());
            BigInteger b = new BigInteger(sc.nextLine());
            BigInteger GCD= a.gcd(b);
            BigInteger LCM= a.multiply(b).divide(GCD);
            System.out.println(LCM);
        }
    }
}
