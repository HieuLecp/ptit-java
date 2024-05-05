import java.util.*;
public class sodep1 {

    public static String check(String s)
    {
        for(int i=0; i<s.length(); ++i)
        {
            if(s.charAt(i)%2 != 0)
                return "NO";
        }
        String res= new StringBuilder(s).reverse().toString();
        if(s.equals(res))
            return "YES";
        return "NO";
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- >0)
        {
            String s= sc.next();
            System.out.println(check(s));
        }
    }
}
