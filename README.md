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

**Tangkapan Layar saat Running Program**

1. Menu Utama
   
   <img width="254" height="83" alt="Screenshot 2026-09-21 213326" src="https://github.com/user-attachments/assets/a287143d-d230-4e88-8c59-c21257cdb3bf" />

2. Menu Create
  
   <img width="385" height="197" alt="Screenshot 2026-09-21 213422" src="https://github.com/user-attachments/assets/8ec6c236-16a9-4cac-801b-6f18351b0291" />

3. Menu Read
     
   <img width="325" height="148" alt="Screenshot 2026-09-21 213438" src="https://github.com/user-attachments/assets/328c65bb-2602-4942-928e-ae58074b3f31" />

4. Menu Update
        
   <img width="469" height="200" alt="Screenshot 2026-09-21 213538" src="https://github.com/user-attachments/assets/9d342f5e-1c4c-46be-a875-5d9e04497e0a" />

 5. Menu Delete
 
 <img width="422" height="255" alt="Screenshot 2026-09-21 213554" src="https://github.com/user-attachments/assets/0ab2e63e-89cc-41de-b621-96e5dc130049" />

 6. Menu Exit

    <img width="422" height="255" alt="Screenshot 2026-09-21 213554" src="https://github.com/user-attachments/assets/207daecf-6151-451d-9e72-b55f2f20575a" />




