import java.util.*;
public class giaiptbacnhat {
    public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			double a = sc.nextDouble(), b = sc.nextDouble();
			if(a==0) {
				if(b==0) 
					System.out.println("VSN");
				else 
					System.out.println("VN");
			}
			else 
				System.out.printf("%.2f", -b/a);
		}
	}
}
