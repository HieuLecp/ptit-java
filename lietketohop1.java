import java.util.*;
public class lietketohop1 {
    static int n, k;
    static int dem=0;
    public static void Try(int i, String s)
    {
        if(s.length()==k)
        {
            System.out.println(s);
            dem++;
            return ;
        }
        for(int j=i; j<=n; ++j)
        {
            Try(j+1, s+Integer.toString(j)+" ");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        k <<=1;
        Try(1, "");
        System.out.println("Tong cong co "+dem+" to hop");
    }
}
