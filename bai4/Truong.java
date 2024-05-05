package java.bai4;

public class Truong implements Comparable<Truong> {
    private String ma, ten;

    public Truong(String ma, String ten){
        this.ma = ma;
        this.ten = ten;
    }

    public String getMa(){
        return ma;
    }

    @Override
    public int compareTo(Truong o){
        return this.ten.compareTo(o.ten);
    }

    @Override
    public String toString(){
        return this.ten;
    }
}
