import java.util.*;
public class hopcuahaidayso {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n, m;
        n=sc.nextInt();
        m=sc.nextInt();
        int[] a= new int[n], b= new int[m];
        int[] X= new int[1010];
        for(int i=0; i<1010; ++i)
            X[i]=0;
        for(int i=0; i<n; ++i)
        {
            a[i]=sc.nextInt();
            X[a[i]]++;
        }
        for(int j=0; j<m; ++j)
        {
            b[j]=sc.nextInt();
            X[b[j]]++;
        }        
        for(int i=1; i<1010; ++i)
        {
            if(X[i]>0)
                System.out.print(i + " ");
        }
    }
}
