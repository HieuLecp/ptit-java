import java.util.*;
public class Daotu {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int t= Integer.parseInt(sc.nextLine());
        while(t-- >0)
        {
            String s= sc.nextLine();
            String[] a= s.split(" ");
            for(String i : a)
            {
                StringBuilder res= new StringBuilder(i);
                System.out.print(res.reverse().toString() + " ");
            }
            System.out.println();
        }
    }
}
