import java.util.*;
public class matrannhiphan {

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a= new int[1005][5];
        int dem=0;
        for(int i=0; i<n; ++i)
        {
            int cnt=0;
            for(int j=0; j<3; ++j)
            {
                a[i][j]= sc.nextInt();
                if(a[i][j]==1)
                    ++cnt;
            }
            if(cnt>1)
                ++dem;
        }
        System.out.println(dem);
    }
}
