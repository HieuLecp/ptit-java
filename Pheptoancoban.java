import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class Pheptoancoban {
    public static void main(String[] args) throws Exception{
        Scanner sc= new Scanner(new File("DAYSO.in"));
        int n= sc.nextInt();
        sc.nextLine();
        List<BigInteger>arr= new ArrayList<>();
        BigInteger sum= new BigInteger("0");
        while(n-- >0)
        {
            BigInteger tmp= new BigInteger(sc.nextLine());
            arr.add(tmp);
        }
        Collections.sort(arr);
        System.out.println(arr.get(0));
        System.out.println(arr.get(arr.size()-1));
        for(BigInteger i : arr)
        {
            sum= sum.add(i);
        }
        System.out.println(sum);
    }
}
