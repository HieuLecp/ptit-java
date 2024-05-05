import java.util.Scanner;

public class chuso4vachuso7 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
		char[] a=s.toCharArray();
		int dem=0;
		for(int i=0; i<s.length(); ++i)
		{
			if(a[i]=='4' || a[i]=='7')
				++dem;
		}
		if(dem==7 || dem==4)
			System.out.println("YES");
		else
			System.out.println("NO");
    }
}
