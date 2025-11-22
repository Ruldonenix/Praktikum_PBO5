package Pertemuan7;

public class Main {
    public static void main(String[] args) {
        Guru guru = new Guru(123, 3, "Agung", "Bahasa Inggris");
        Siswa siswa = new Siswa();
//        siswa.nama = "Kelvin";
//        guru.nama_siswa = siswa.nama;
        
//        guru.nip = 1234516;
//        guru.nama = "Renaldi Putra";
//        guru.mapel = "Biologi";
//        guru.jml_kelas = 3;

//        guru.mengajar();
//        guru.namaGuru("Budi");
        guru.informasiGuru();
        
        Kelas kls = new Kelas();
        kls.id_kelas = 1;
        kls.nama = "XII IPA 3";
        
        guru.kelas = kls;
        guru.kelas.id_kelas = 1;
        
    }
}