import java.util.*;
public class sokhonglienke {
    public static boolean check(String s) {
        for(int i=1; i< s.length(); ++i)
            if(Math.abs((s.charAt(i) - '0')-(s.charAt(i-1) - '0')) !=2)
                return false;
        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner( System.in);
        int t=sc.nextInt();
        while(t-- >0)
        {
            String s=sc.next();
            long n=Long.parseLong(s);
            long tong=0;
            while(n!=0)
            {
                tong = tong+ n%10;
                n=n/10;
            }
            if(check(s)&&tong%10==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
