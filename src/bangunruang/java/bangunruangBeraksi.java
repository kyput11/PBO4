package bangunruang.java;

public class bangunruangBeraksi {
    public static void main(String[] args) {
        // Kubus
        Bangunruang bgr = new Bangunruang(5);
        // Balok
        Bangunruang bgr1 = new Bangunruang(5, 6, 7);
        
        System.out.println("Volume Kubus : " + bgr.VolumeKubus());
        System.out.println("Volume Balok : " + bgr1.VolumeBalok());  // Gunakan bgr1 untuk balok
        
        System.out.println(" ");
        
        System.out.println("Luas Permukaan Kubus : " + bgr.LuasPermukaanKubus());
        System.out.println("Luas Permukaan Balok : " + bgr1.LuasPermukaanBalok());  // Gunakan bgr1 untuk balok
    }
}
