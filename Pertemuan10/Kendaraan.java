package Pertemuan10;

public class Kendaraan extends BendaBergerak{
    private String nama;
    private int kecepatan;
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        if(kecepatan < 0){
            System.out.println("Kendaraan tidak berjalan");
        } else {
            this.kecepatan = kecepatan;
        }
    }
    
    void bergerak() {
        System.out.println("Kendaraan bergerak");
    }

    @Override
    void tampilNama() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
