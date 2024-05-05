import java.util.*;
public class BSCUSC {
    public static long tinh(long a, long b) 
	{
		while(a!=b) 
		{
			if(a>b)
				a=a-b;
			else
				b=b-a;
		}
		return a;
	}

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
			int t=sc.nextInt();
			long a, b;
			while(t-- >0) 
			{
				a=sc.nextLong();
				b=sc.nextLong();
				System.out.println(a*b/tinh(a,b) + " " + tinh(a,b));
			}
	}
}
