package J04003;

public class Phanso {
    private long Tuso, Mauso;
    public Phanso(long Tuso, long Mauso){
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
    public static long gcd(long a, long b){
        if(b == 0)
            return a;
        return gcd(b,a%b);
    }
    public void kq(){
        long GCD= gcd(this.Tuso, this.Mauso);
        this.Tuso /= GCD;
        this.Mauso /= GCD;
    }
}
