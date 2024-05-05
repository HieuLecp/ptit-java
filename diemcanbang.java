import java.util.*;
public class diemcanbang {

    static int kq(int n, int a[])
    {
        int left=0;
        int tong=0;
        for(int i=1; i<=n; ++i)
        {
            tong += a[i];
        }
        for(int i=1; i<=n; ++i)
        {
            tong -= a[i];
            if(left==tong)
            {
                return i;
            }
            left += a[i];
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- >0)
        {
            int n=sc.nextInt();
            int[] a= new int[100005];
            for(int i=1; i<=n; ++i)
                a[i]=sc.nextInt();
            int cnt= kq(n,a);
            System.out.println(cnt);
        }
    }
}
