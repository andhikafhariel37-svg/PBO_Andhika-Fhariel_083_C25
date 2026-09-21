/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemlaporankebakaran;

/**
 *
 * @author User
 */
public class LaporanKebakaran {
    private String lokasi;

    public LaporanKebakaran(String lokasi) {
        this.lokasi = lokasi;
    }

    // Getter & Setter (Encapsulation)
    public String getLokasi() { return lokasi; }
    public void setLokasi(String lokasi) { this.lokasi = lokasi; }

    // Method dasar
    public void tampilkanDetail() {
        System.out.println("Lokasi        : " + lokasi);
    }
}