package p9;

//parent class atau superclass
public class Hewan {
    //private protected public
    //private bisa diakses oleh class nya sendiri
    //public bisa diakses oleh class manapun
    public String nama, suara, cara_lahir;
    public int berat;
    
    //constructor
    public Hewan(String nama, String suara, String cara_lahir, int berat){
        this.nama = nama;
        this.suara = suara;
        this.cara_lahir = cara_lahir;
        this.berat = berat;
    }
    
    void bersuara(String suara){
        System.out.println("Hewan in bersuara " + suara);
    }
    
    void bertelur(String cara_lahir){
        System.out.println("Hewan ini melahirkan dengan cara " + cara_lahir);
    }
    
    void show(){
        System.out.println("Nama              : " + this.nama);
        System.out.println("Suara             : " + this.suara);
        System.out.println("Cara Melahirkan   : " + this.cara_lahir);
        System.out.println("Berat             : " + this.berat);
    }
}

//child class atau subclass
class Ovipar extends Hewan{
    
    String cara_melahirkan;
    
    //constructor dari superclass
//    public Ovipar(String nama, String suara, int berat, String cara_melahirkan) {
//        super(nama, suara, berat);
//        this.cara_melahirkan = cara_melahirkan;
//        super.bersuara(suara);
//    }
    
    public Ovipar(String nama, String suara, int berat, String cara_melahirkan) {
        super(nama, suara, berat, cara_melahirkan);
        this.cara_melahirkan = cara_melahirkan;
        super.bersuara(suara);
    }

}
