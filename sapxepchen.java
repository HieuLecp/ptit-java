import java.util.*;

public class sapxepchen {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<Integer> a= new ArrayList<>();
        for(int i=0; i<n; ++i)
        {
            System.out.print("Buoc "+i+": ");
            a.add(sc.nextInt());
            Collections.sort(a);
            for(int j : a)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}