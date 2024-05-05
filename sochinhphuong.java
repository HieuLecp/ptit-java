import java.util.*;
public class sochinhphuong {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        long n;
        while(t-- >0)
        {
            n=sc.nextInt();
            long s= (long)Math.sqrt(n);
            if(s*s == n)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
