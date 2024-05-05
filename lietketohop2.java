import java.util.*;
public class lietketohop2 {
    static int n, k;
    static int dem=0;
    public static void Try(int i, String s)
    {
        if(s.length()==k)
        {
            System.out.print(s + " ");
            dem++;
            return ;
        }
        for(int j=i; j<=n; ++j)
        {
            Try(j+1, s+Integer.toString(j));
        }
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        Try(1, "");
        System.out.println();
        System.out.println("Tong cong co "+dem+" to hop");
    }
}
