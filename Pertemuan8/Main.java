package Pertemuan8;

class Laptop{
    String merk;
    int layar;
    String processor;
    
    Laptop(){
        System.out.println("Ini adalah Laptop");
        this.merk = "Axioo";
        this.layar = 60;
        this.processor = "AMD";
    }
    
    Laptop(String merk){
        this.merk = merk;
    }
    
    Laptop(String merk, String processor){
        this.merk = merk;
        this.processor = processor;
    }
    
    void tampilData(String mouse){
        System.out.println("Merk : " + merk);
        System.out.println("Layar : " + layar);
        System.out.println("Processor : " + processor);
        System.out.println("Mouse : " + mouse);
    }
}

//class GetLaptop{
//    public Laptop getLaptop(){
//        Laptop lpt1 = new Laptop("LOQ", 144);
//        return lpt1;
//    }
//}

public class Main {
    public static void main(String[] args) {
//        Laptop lpt1 = new Laptop();
//        System.out.println("Laptop pertama adalah " + lpt1.merk);
//        
//        Laptop lpt2 = new Laptop("MSI ", "Ryzen");
//        System.out.print("Laptop kedua adalah " + lpt2.merk);
//        System.out.println("menggunakan processor " + lpt2.processor);
        
    }    
}
