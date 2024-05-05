package java.bai4;

public class Doi implements Comparable<Doi> {
    private String ten;
    private Truong truong;

    public Doi(String ten, Truong truong){
        this.ten= ten;
        this.truong= truong;
    }

    @Override
    public int compareTo(Doi o){
        if(this.truong.compareTo(o.truong) != 0)
            return this.truong.compareTo(o.truong);
        return this.ten.compareTo(o.ten);
    }

    @Override
    public String toString(){
        return this.ten + " " + this.truong;
    }
}
