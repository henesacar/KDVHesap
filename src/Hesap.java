import java.util.Scanner;

public class Hesap {
    static final double KDV = 0.18;
    static final double KKDV = 0.08;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Lütfen hesaplamak istediğiniz tutarı girin: ");
        int tutar = scn.nextInt();
        double snc = (tutar>=1000)? tutar*KKDV : tutar*KDV;
        System.out.println("Hesaplanan KDV miktarı: " +snc);
    }
}
