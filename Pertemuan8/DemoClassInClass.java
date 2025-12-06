package Pertemuan8;

class Luar{
    private String nama = "Class Outside";
    
    class Dalam{
        public void ngomong(){
            System.out.println("Gwehj ada di kelas " + nama);
            System.out.println("My gwehj gw juga kelas ");
        }
    }
}

public class DemoClassInClass {
    public static void main(String[] args) {
        Luar out = new Luar();
        
        Luar.Dalam inside = out.new Dalam();
        
        inside.ngomong();
    }
}
