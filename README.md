**Sistem Laporan Kebakaran Hutan**

Jadi saya memilih sistem ini karena hasil pikiran random saya ketika di lampu merah yang saya rasa cukup relevan untuk di masa sekarang. Di Sistem ini kita bisa menambahkan laporan, melihat data laporan, mengubah data laporan, dan menghapus data laporan.

**Identitas Mahasiswa**

Nama : Andhika Fhariel Fadhlurrohman

NIM : 2509116083

Kelas : C 2025

**Deskripsi Studi Kasus**

Sistem Laporan Kebakaran dirancang untuk merekap laporan kebakaran dari warga, dan menyeleksi mana yang harus ditangani terlebih dahulu. Program akan meminta masukkan laporan berupa:

Lokasi dan Tingkat Bahaya.

Dari fitur input tersebut, sistem akan menampung laporan laporan dari masyarakat dan memudahkan untuk diketahui oleh petugas.

**Hierarki & Struktur Data**

Program ini menerapkan prinsip-prinsip Pemrograman Berbasis Objek (PBO) melalui beberapa kelas utama:

Main: Entry point yang mengatur alur jalannya program, pemrosesan input/output pengguna, pengelolaan daftar laporan di memori, serta perulangan menu operasi CRUD.

LaporanKebakaran: Berperan sebagai Superclass (induk) yang menerapkan Enkapsulasi (Encapsulation) untuk membungkus properti umum bencana, seperti lokasi.

LaporanKebakaranHutan: Berperan sebagai Subclass (turunan) yang mewarisi sifat dasar dari superclass LaporanKebakaran, serta menambahkan atribut khusus yaitu tingkatBahaya dan menerapkan Polimorfisme (Polymorphism) pada metode pencetakan detail laporan.

<img width="380" height="372" alt="PBOMATKUL" src="https://github.com/user-attachments/assets/cbc1a487-c1b6-4fe3-b1b1-fd88f804ee16" />

**Penerapan Inheritance**

Penerapan Inheritance (pewarisan) diimplementasikan dengan memanfaatkan kata kunci extends pada deklarasi kelas subclass.

Contoh Implementasi Kode:

// Superclass
public class LaporanKebakaran {
    protected String lokasi;

    public LaporanKebakaran(String lokasi) {
        this.lokasi = lokasi;
    }

    public void tampilkanDetail() {
        System.out.println("Lokasi        : " + lokasi);
    }
}

// Subclass
public class LaporanKebakaranHutan extends LaporanKebakaran {
    private String tingkatBahaya; // Atribut spesifik subclass

    public LaporanKebakaranHutan(String lokasi, String tingkatBahaya) {
        super(lokasi); // Mewarisi atribut lokasi dari superclass
        this.tingkatBahaya = tingkatBahaya;
    }

    @Override
    public void tampilkanDetail() {
        super.tampilkanDetail(); // Memanggil method milik superclass
        System.out.println("Tingkat Bahaya: " + tingkatBahaya);
    }
}
