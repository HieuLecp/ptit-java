import java.util.*;
public class Danhdauchucai {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        Set<Character> a= new HashSet();
        for(int i=0; i<s.length(); ++i)
        {
            a.add(s.charAt(i));
        }
        System.out.println(a.size());
    }
}
