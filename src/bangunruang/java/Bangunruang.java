package bangunruang.java;

public class Bangunruang {
    double s, p, l, t;
    
    // Konstruktor untuk balok
    public Bangunruang(double p, double l, double t) {
        this.p = p;
        this.l = l;
        this.t = t;
    }
    
    // Konstruktor untuk kubus
    public Bangunruang(double s) {
        this.s = s;
    }
    
    // Volume kubus
    public double VolumeKubus() {
        return s * s * s;
    }
    
    // Volume balok
    public double VolumeBalok() {
        return p * l * t;
    }
    
    // Luas permukaan kubus
    public double LuasPermukaanKubus() {
        return 6 * (s * s);
    }
    
    // Luas permukaan balok
    public double LuasPermukaanBalok() {
        return 2 * ((p * l) + (p * t) + (l * t));
    }
}
