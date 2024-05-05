import java.util.*;
public class Diachiemail {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int t= Integer.parseInt(sc.nextLine());
        String ds[]= new String[50];
        for(int i=0; i<t; ++i)
        {
            String s= sc.nextLine().trim().toLowerCase();
            s=chuanHoa(s);
            ds[i]=s;
            // System.out.println(s+ "@ptit.edu.vn");
        }
        // System.out.print(ds.length);

        for(int i=0; i<t; ++i)
        {
            int dem=1;
            for(int j=i-1; j>=0; j--)
            {
                if(ds[i].equals(ds[j])) dem++;
            }
            if(dem==1)
                System.out.println(ds[i] + "@ptit.edu.vn");
            else
                System.out.println(ds[i] + dem + "@ptit.edu.vn");
        }
    }

    public static String chuanHoa(String s) {
        StringBuilder kq = new StringBuilder();
        String ds[] = s.split("\\s+");
        kq.append(ds[ds.length-1]);
        for(int i=0; i<ds.length -1; ++i)
        {
            kq.append(ds[i].charAt(0));
        }
        return kq.toString();
    }
}
