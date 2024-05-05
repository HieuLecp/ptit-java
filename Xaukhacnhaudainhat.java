import java.util.*;
public class Xaukhacnhaudainhat {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int t= Integer.parseInt(sc.nextLine());
        while(t-- >0)
        {
            String a= sc.next();
            String b= sc.next();
            if(a.equals(b))
                System.out.println("-1");
            else 
                System.out.println(Math.max(a.length(), b.length()));
        }
    }
}
