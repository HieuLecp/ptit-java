import java.util.*;
public class Biensodep {

    static boolean bangnhau1(String s)
    {
        char check=s.charAt(0);
        for(int i=1; i<s.length(); ++i)
        {
            if(s.charAt(i) != check)
                return false;
        }
        return true;
    }
    static boolean tangchat(String s)
    {
        for(int i=0; i<s.length()-1; ++i)
        {
            if(s.charAt(i) >= s.charAt(i+1))
                return false;
        }
        return true;
    }
    static boolean bangnhau2(String s)
    {
        char check=s.charAt(0);
        for(int i=1; i<s.length()-2; ++i)
        {
            if(s.charAt(i) != check)
                return false;
        }
        if(s.charAt(3) != s.charAt(4))
            return false;
        return true;
    }
    static boolean locphat(String s)
    {
        for(int i=0; i<s.length(); ++i)
        {
            if(s.charAt(i) != '6' && s.charAt(i) != '8')
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int t= Integer.parseInt(sc.nextLine());
        while(t-- >0)
        {
            String s= sc.nextLine().trim().substring(5);
            String res= s.substring(0, 3) + s.substring(4);
            if(tangchat(res) || bangnhau1(res) || bangnhau2(res) || locphat(res))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
