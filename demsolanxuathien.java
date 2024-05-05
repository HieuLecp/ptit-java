import java.util.*;

public class demsolanxuathien {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=1; k<=t; ++k)
        {
            int n=sc.nextInt();
            int[] a= new int[n];
            int[] b= new int[1000000];
            for(int i=0; i<n; ++i)
            {
                a[i]= sc.nextInt();
                ++b[a[i]];
            }
            System.out.println("Test " + k + ":");
            for(int i=0; i<n; ++i)
            {
                if(b[a[i]]>0)
                    System.out.println(a[i]+" xuat hien "+b[a[i]]+" lan");
                    b[a[i]]=0;
            }
        }
    }
}
