package Pertemuan6;

//import java.util.ArrayList;
//import java.util.Scanner;

class CetakAngka extends Thread{
    String nama;

    CetakAngka(String nama){
        this.nama = nama;
    }
    
    public void run(){
        for (int i=0; i<5; i++){
            System.out.println(nama  + " mencetak : " + i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
        
        
        
public class Main {
    public static void main(String[] args) throws Exception {
        CetakAngka nama1 = new CetakAngka("Bidzyx");
        CetakAngka nama2 = new CetakAngka("Donezyx");
        nama1.start();
        nama2.start();
        System.out.println("Program Selesai");
        
        
//        String nama[] = {"Bidzyx", "Donezyx", "Sidezyx"};
//        System.out.println(nama[1]);
//        for(String temp : nama){
//            System.out.println(temp);
//        } //array 1 dimensi
        

//        int matrix[][] = //kolom pertama baris, kolom kedua kolom 
//        {
//            {1,2,3},
//            {4,5,6},
//            {7,8,9}
//        };
//        
//        for(int n[] : matrix){
//            for(int m : n){
//                System.out.print(m + " ");
//            }
//            System.out.println("");//array 2 dimensi
//        }

          
//          ArrayList<String> nama = new ArrayList<>();
          
//          nama.add("Bidzyx");
//          nama.add("Donezyx");
//          nama.add("Sidezyx");
          
//          System.out.println("Nama Saya : " + nama.get(0));
//          System.out.println("Nama Saya : " + nama.get(1));
//          System.out.println("Nama Saya : " + nama.get(2));
//          System.out.println("Nama Saya : " + nama);
          
//          nama.remove(2);
//          System.out.println(nama);
          
//          nama.set(1, "Bijix");
//          System.out.println(nama);
        
//        Scanner input = new Scanner(System.in);
//        try{
//            int a = 10;
////            int a = input.nextInt();
//            int b = 0;
////            int b = input.nextInt();
//            int hasil = a/b;
            
//            System.out.println("Hasil : " + hasil);
//        }catch(ArithmeticException e){
//            System.out.println("Tidak boleh dibagi 0");
//        }catch(Exception e){
//            System.out.println(e);
//        }
//        
//        System.out.println("Program Selesai");

//        try{
//            int umur = 15;
//            if(umur < 17){
//                throw new Exception("Tidak Bisa Buat KTP");
//            }
//        }catch(Exception e){
//            System.out.println(e);
//        }

    }
}
