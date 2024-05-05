package J04003;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        long a= sc.nextLong(), b=sc.nextLong();
        Phanso A= new Phanso(a,b);
        A.kq();
        System.out.println(A.getTuso() + "/" + A.getMauso());
    }
}
