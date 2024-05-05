import java.util.*;

public class sotamphan {
    static String check(String s)
    {
        char[] a=s.toCharArray();
        for(int i=0; i<s.length(); ++i)
            if(a[i] > '2')
                return "NO";
        return "YES";
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        String s;
        while(t-- > 0)
        {
            s=sc.next();
            System.out.println(check(s));
        }
    }
}
