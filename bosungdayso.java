import java.util.*;
public class bosungdayso {

    public static void conthieu(ArrayList<Integer> a)
    {
        int cnt=1;
        ArrayList<Integer> b= new ArrayList<>();
        for(int i : a)
        {
            if(cnt==i)
                cnt++;
            while(cnt<i)
            {
                b.add(cnt);
                cnt++;
            }
            cnt=i+1;
        }
        if(b.size() != 0)
            for(int i : b)
                System.out.println(i);
        else
            System.out.println("Excellent!");
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<Integer> a= new ArrayList<>();
        for(int i=0; i<n; ++i)
            a.add(sc.nextInt());
        conthieu(a);
    }
}
