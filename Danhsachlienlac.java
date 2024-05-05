import java.util.*;
import java.io.File;

class SinhVien{
    private String msv, ten, lop, gmail, sdt;
    public SinhVien(String msv, String ten, String lop, String gmail, String sdt){
        this.msv=msv;
        this.ten=ten;
        this.lop=lop;
        this.gmail=gmail;
        this.sdt="0" + sdt;
    }
    public String getmsv(){
        return msv;
    }
    public String getlop(){
        return lop;
    }
    public String toString(){
        return msv + " " + ten + " " + lop + " " + gmail + " " + sdt;
    }
}

public class Danhsachlienlac {
    public static void main(String[] args)throws Exception {
        Scanner sc= new Scanner(new File("DANHSACH.in"));
        List<SinhVien> list= new ArrayList<SinhVien>();
        while(sc.hasNextLine())
        {
            SinhVien sv= new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            list.add(sv);
        }
        list.sort((s1,s2) ->{
            if(s1.getlop().equals(s2.getlop()))
            {
                return s1.getmsv().compareTo(s2.getmsv());
            }
            else
            {
                return s1.getlop().compareTo(s2.getlop());
            }
        });
        for(SinhVien sv : list)
        {
            System.out.println(sv);
        }
    }
}
