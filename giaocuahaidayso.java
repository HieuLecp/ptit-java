import java.util.*;
public class giaocuahaidayso {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n, m;
        n=sc.nextInt();
        m=sc.nextInt();
        int[] a= new int[n], b= new int[m];
        int[] A= new int[1010], B= new int[1010];
        for(int i=0; i<1010; ++i)
            A[i]=B[i]=0;
        for(int i=0; i<n; ++i)
        {
            a[i]=sc.nextInt();
            A[a[i]]=1;
        }
        for(int j=0; j<m; ++j)
        {
            b[j]=sc.nextInt();
            B[b[j]]=1;
        }        
        for(int i=1; i<1010; ++i)
        {
            if(A[i]==1 && B[i]==1)
                System.out.print(i + " ");
        }
    }
}
