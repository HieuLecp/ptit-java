import java.util.*;

import javax.swing.plaf.synth.SynthStyle;
public class Lopuser {

    static boolean check(String username, String password)
    {
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] a= new int[105];
        for(int i=0; i<n; ++i)
        {
            String[] x=sc.nextLine().split(" ");
            String username= x[0];
            String password= x[1];
            if(check(username, password))
            {
                a[i] ++;
            }
        }
        int m= sc.nextInt();
        for(int i=0; i<m; ++i)
        {
            String logininfor= sc.nextLine();
            String[] logindata= logininfor.split(" ");
            String username= logindata[0];
            String password= logindata[1];
            for(int j=0; j<n; ++j)
            {
                if(username.equals(username[j]) && password.equals(password[j]))
                    a[j]++;
            }
        }
        for(int i=0; i<n; ++i)
        System.out.print(a[i] + " ");
    }
}
