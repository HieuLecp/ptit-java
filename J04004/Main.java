package J04004;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        long a= sc.nextLong(), b=sc.nextLong();
        PhanSo A= new PhanSo(a, b);
        a= sc.nextLong();
        b= sc.nextLong();
        PhanSo B= new PhanSo(a, b);
        A.tong(B);
        System.out.printf(A.getTuso() + "/" + A.getMauso());
    }
}
