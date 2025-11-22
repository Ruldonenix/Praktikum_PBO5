package Pertemuan7;

class Guru {
    private int nip, jml_kelas;
    private String nama, mapel;
    public Kelas kelas;

    public Guru(int nip, int jml_kelas, String nama, String mapel){
        this.nip = nip;
        this.jml_kelas = jml_kelas;
        this.nama = nama;
        this.mapel = mapel;
    }
    
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    //public; -> bisa diakses dimana pun
    //private; -> hanya bisa diakses oleh class tersebut
    //prtected; -> bisa diakses oleh class tersebut dan turunannya
    //method biasanya berdasarkan attribut nya
    
//    public void mengajar(){
//        System.out.println("Guru Mengajar " + jml_kelas + " Kelas");
//    }
    
    public void informasiGuru(){
        System.out.println("NIP             : " + nip);
        System.out.println("NAMA            : " + nama);
        System.out.println("MAPEL           : " + mapel);
        System.out.println("JUMLAH KELAS    : " + jml_kelas);
        System.out.println("ID KELAS        : " + this.kelas.id_kelas);
        System.out.println("WALI KELAS      : " + this.kelas.nama);
    }
    
//    public void namaGuru(String nama){
//        this.nama = nama;
//        System.out.println("Halo, nama bapak " + nama);
//    }
}
