import java.util.*;
public class catdoi {
    public static String cat(String n) 
	{
		char[] a= n.toCharArray();
		for(int i=0; i<n.length(); ++i) 
		{
			if(a[i]=='0' || a[i]=='1' || a[i]=='8' || a[i]=='9') 
			{
				if(a[i]=='8' || a[i]=='9') 
				{
					a[i] = '0';
				}
			}
			else return "INVALID";
		}
		String res = "";
		int id=0;
		while(id<n.length() && a[id]=='0') 
			++id;
		for(int i=id; i<n.length(); ++i) 
			res+=a[i];
		if(res.length() == 0) 
		    return "INVALID";
		return res;
	}

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		String n;
		while(t-- >0)
		{
			n= sc.next();
			System.out.println(cat(n));
		}
	}
}
