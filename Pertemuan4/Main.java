//package Pertemuan4;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        //IF
//        Scanner input = new Scanner(System.in); //Objek
//        //jika merupakan wni dan berumur > 17 tahun
//        //maka bisa membuat ktp
//        String wni;
//        int umur;
//        
//        System.out.print("Apakah anda WNI? (Ya/Tidak): ");
//        wni = input.nextLine();
//        System.out.print("Masukkan Umur: ");
//        umur = input.nextInt();
//        
//        if ("Ya".equalsIgnoreCase(wni)){ //bisa juga wni.equals("Ya")
//            if (umur >= 17){
//                System.out.println("Anda bisa membuat KTP");
//            } else {
//                System.out.println("Anda tidak cukup umur!");
//            }
//        } else {
//            System.out.println("ANDA WNA!");
//        }
//        
//        
//        
//        int x;
//        
//        System.out.print("Masukkan Angka: ");
//        x = input.nextInt();
//        System.out.println("Angka: " + x);
//        
//        if (x < 0) {System.out.println("Angka negatif"); 
//        } else if (x == 0) {
//            System.out.println("Angka nol");
//        } else {
//            System.out.println("Angka positif");
//        }
//        
//        //SWITCH
//        System.out.println("Menu Mie Ayam Ipey");
//        System.out.println("1. Mie Ayam Biasa");
//        System.out.println("2. Mie Ayam Spesial");
//        System.out.println("3. Dimsum");
//        System.out.print("Masukkan Pilihan: ");
//        int pilihan = input.nextInt();
//        
//        switch(pilihan) {
//            case 1 -> System.out.println("Mie Ayam Biasa");
//            case 2 -> System.out.println("Mie Ayam Spesial");
//            case 3 -> System.out.println("Dimsum");
//            default -> System.out.println("Menu tidak ada");
//        }
//    }    
//    
//    
//    
//}    