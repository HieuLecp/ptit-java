import java.util.Scanner;

public class J02008 {
    static long gcd(long a, long b)
    {
       if(b==0)
            return a;
        return gcd(b, a%b);
    }

    public static void main(String[] args)
    {
        long[] a= new long[110];
        a[1]=1;
        a[2]=2;
        for(int i=3; i<=100; i++)
        {
            a[i]=(long)i * a[i-1] / gcd((long)i , a[i-1]);
        }
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0)
        {
            int n= sc.nextInt();
            System.out.println(a[n]);
        }
    }
}
