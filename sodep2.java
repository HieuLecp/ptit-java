import java.util.*;
public class sodep2 {

    public static String check(String s)
    {
        if(s.charAt(0) != '8' || s.charAt(s.length()-1) != '8')
            return "NO";
        int sum=0;
        for(int i=0; i<s.length(); ++i)
            sum += s.charAt(i) - '0';
        if(sum%10 != 0)
            return "NO";
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
