package Pertemuan10;

public class Motor extends Kendaraan implements Mesin{
    @Override
    void bergerak() {
        System.out.println("Motor bergerak mundur");
    }

    void bergerak(String nama) {
        System.out.println(nama + " sedang melaju kencang");
    } //Overload   

    @Override
    public void nyala() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void boreUp() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void gantiOli() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
