package Pertemuan10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Kendaraan K1 = new Kendaraan();
        Motor M1 = new Motor();
        KapalLawd KL1 = new KapalLawd();
        
        Kendaraan K = new Kendaraan();
        Kendaraan K2 = new Motor();
        Kendaraan K3 = new KapalLawd();
        
        K1.bergerak();
        K2.bergerak();
        K3.bergerak();
        
//        
//        K1.bergerak();
//        M1.bergerak();
//        M1.bergerak("Yamaha");
//        
//        K1.getNama();
//        K1.setNama("Testarossa");
//        
//        
//        K1.getKecepatan();
//        K1.setKecepatan(290);
//        
//        Scanner input = new Scanner(System.in);
//        int kecepatan;
//        System.out.print("Masukkan Kecepatan : ");
//        kecepatan = input.nextInt();
//        K1.setKecepatan(kecepatan);
//        System.out.println(K1.getNama() + " sedang melaju " + K1.getKecepatan() + "km/h");
        
    }
}
