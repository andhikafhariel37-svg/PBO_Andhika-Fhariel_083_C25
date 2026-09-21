/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemlaporankebakaran;

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<LaporanKebakaranHutan> daftarLaporan = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== LAPORAN KEBAKARAN HUTAN ===");
            System.out.println("1. Tambah Laporan (Create)");
            System.out.println("2. Lihat Semua Laporan (Read)");
            System.out.println("3. Ubah Laporan (Update)");
            System.out.println("4. Hapus Laporan (Delete)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu [1-5]: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (pilihan) {
                case 1 -> tambahLaporan();
                case 2 -> lihatLaporan();
                case 3 -> updateLaporan();
                case 4 -> hapusLaporan();
                case 5 -> System.out.println("Program selesai.");
                default -> System.out.println("Pilihan salah!");
            }
        } while (pilihan != 5);
    }

    // CREATE
    private static void tambahLaporan() {
        System.out.print("Masukkan Lokasi        : ");
        String lokasi = scanner.nextLine();
        System.out.print("Masukkan Tingkat Bahaya: ");
        String bahaya = scanner.nextLine();

        daftarLaporan.add(new LaporanKebakaranHutan(lokasi, bahaya));
        System.out.println("Laporan berhasil ditambahkan!");
    }

    // READ
    private static void lihatLaporan() {
        if (daftarLaporan.isEmpty()) {
            System.out.println("Belum ada laporan.");
            return;
        }
        System.out.println("\n--- DAFTAR LAPORAN ---");
        for (int i = 0; i < daftarLaporan.size(); i++) {
            System.out.println("\nLaporan Ke-" + (i + 1));
            daftarLaporan.get(i).tampilkanDetail();
        }
    }

    // UPDATE
    private static void updateLaporan() {
        lihatLaporan();
        if (daftarLaporan.isEmpty()) return;

        System.out.print("\nPilih Nomor Laporan yang ingin diubah: ");
        int indeks = scanner.nextInt() - 1;
        scanner.nextLine();

        if (indeks >= 0 && indeks < daftarLaporan.size()) {
            LaporanKebakaranHutan laporan = daftarLaporan.get(indeks);
            System.out.print("Lokasi Baru         : ");
            laporan.setLokasi(scanner.nextLine());
            System.out.print("Tingkat Bahaya Baru : ");
            laporan.setTingkatBahaya(scanner.nextLine());

            System.out.println("Laporan berhasil diperbarui!");
        } else {
            System.out.println("Nomor laporan tidak valid!");
        }
    }

    // DELETE
    private static void hapusLaporan() {
        lihatLaporan();
        if (daftarLaporan.isEmpty()) return;

        System.out.print("\nPilih Nomor Laporan yang ingin dihapus: ");
        int indeks = scanner.nextInt() - 1;
        scanner.nextLine();

        if (indeks >= 0 && indeks < daftarLaporan.size()) {
            daftarLaporan.remove(indeks);
            System.out.println("Laporan berhasil dihapus!");
        } else {
            System.out.println("Nomor laporan tidak valid!");
        }
    }
}