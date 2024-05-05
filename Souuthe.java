import java.util.*;
public class Souuthe {

    static String kq(String s)
    {
        if(s.charAt(0) == '0')
            return "INVALID";
        int le=0, chan=0;
        for(int i=0; i<s.length(); ++i)
        {
            char cnt= s.charAt(i);
            if(!Character.isDigit(cnt))
                return "INVALID";
            else
            {
                int cmt= Character.getNumericValue(cnt);
                if(cmt%2 == 0)
                    chan++;
                else
                    le++;
            }
        }
        int n=s.length();
        if(n%2 == 0 && chan>le)
            return "YES";
        if(n%2 == 1 && chan<le)
            return "YES";
        return "NO";
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int t= Integer.parseInt(sc.nextLine());
        while(t-- >0)
        {
            String s= sc.next();
            System.out.println(kq(s));
        }
    }
}
