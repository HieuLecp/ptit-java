import java.util.*;
public class Dienthoaicucgach {
    static String check(Character a)
    {
        if(a <= 'c')
            return "2";
        if(a <= 'f')
            return "3";
        if(a <= 'i')
            return "4";
        if(a <= 'l')
            return "5";
        if(a <= 'o')
            return "6";
        if(a <= 's')
            return "7";
        if(a <= 'v')
            return "8";
        return "9";
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int t= Integer.parseInt(sc.nextLine());
        while(t-- >0)
        {
            String s= sc.nextLine().toLowerCase();
            String res="";
            for(int i =0; i<s.length(); ++i)
            {
                res += check(s.charAt(i));
            }
            String rev= new StringBuilder(res).reverse().toString();
            if(res.equals(rev))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
