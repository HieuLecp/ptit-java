import java.util.*;

public class sodep3 {

    public static String check(String s)
    {
        for(int i=0; i<s.length(); ++i)
        {
            if(s.charAt(i)!='2' && s.charAt(i)!='3' && s.charAt(i)!='5' && s.charAt(i)!='7')
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
        int t= Integer.parseInt(sc.nextLine());
        while(t-- >0)
        {
            String s= sc.nextLine();
            System.out.println(check(s));
        }
    }
}
