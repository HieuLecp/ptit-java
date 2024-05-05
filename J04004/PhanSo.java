package J04004;

public class PhanSo {
    private long Tuso, Mauso;
    public PhanSo(long Tuso, long Mauso){
        this.Tuso=Tuso;
        this.Mauso=Mauso;
    }
    public long getTuso() {
        return Tuso;
    }
    public void setTuso(long tuso) {
        Tuso = tuso;
    }
    public long getMauso() {
        return Mauso;
    }
    public void setMauso(long mauso) {
        Mauso = mauso;
    }
    public long gcd(long a, long b){
        if(b == 0)
            return a;
        return gcd(b,a%b);
    }
    public void kq(){
        long GCD= gcd(this.Tuso, this.Mauso);
        this.Tuso /= GCD;
        this.Mauso /= GCD;
    }
    public void tong(PhanSo A){
        long MSC= this.Mauso * A.Mauso / gcd(this.Mauso, A.Mauso);
        this.Tuso *= MSC / this.Mauso;
        A.Tuso *= MSC / A.Mauso;
        this.Mauso = MSC;
        this.Tuso += A.Tuso;
        this.kq();
    }
}
