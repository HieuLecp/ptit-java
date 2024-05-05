import java.util.*;

public class sapxepchon {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] a= new int[105];
        int min;
        int t=1;
        for(int i=0; i<n; ++i)
            a[i]= sc.nextInt();
        for(int i=0; i<n-1; ++i)
        {
            System.out.print("Buoc " + (i+1) + ": ");
            min=i;
            for(int j=i+1; j<n; ++j)
            {
                if(a[j]<a[min])
                    min=j;
            }
            int temp= a[min];
            a[min]=a[i];
            a[i]=temp;
            for(int k=0; k<n; ++k)
                System.out.print(+a[k] + " ");
            System.out.println();
        }
    }
}
