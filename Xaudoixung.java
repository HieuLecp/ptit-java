import java.util.*;
public class Xaudoixung {
    static String check(String s)
    {
        int dem=0;
        for(int i=0; i<s.length()/2; ++i)
        {
            if(s.charAt(i) != s.charAt(s.length()-i-1))
                dem ++;
        }
        if(dem <= 1 && (s.length() & 1) == 1)
            return "YES";
        else if(dem == 1 && (s.length() & 1) == 0)
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
