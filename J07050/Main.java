package J07050;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Product> a = new ArrayList<>();
        while (t-- > 0)
            a.add(new Product(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine())));
        Collections.sort(a);
        for (Product i : a)
            System.out.println(i);
    }
}
