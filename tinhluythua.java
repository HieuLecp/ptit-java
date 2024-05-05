import java.util.*;
public class tinhluythua {
    public static int mod = (int)1e9 + 7;
    public static long luythua(long a, long b)
    {
        long res=1;
        while(b>0)
        {
            if(b%2==1)
                res=res*a % mod;
            a=(a*a) % mod;
            b >>= 1;
        }
        return res;
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int t=20;
        while(t-- >0)
        {
            long a=sc.nextLong();
            long b=sc.nextLong();
            if(a==0&&b==0)
                return;
            System.out.println(luythua(a,b));
        }
    }
}
