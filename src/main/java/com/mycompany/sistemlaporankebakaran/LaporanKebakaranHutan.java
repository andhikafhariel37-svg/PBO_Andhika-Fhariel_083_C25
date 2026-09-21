/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemlaporankebakaran;

/**
 *
 * @author User
 */
// Inheritance menggunakan 'extends'
public class LaporanKebakaranHutan extends LaporanKebakaran {
    private String tingkatBahaya; // Contoh: Siaga, Waspada, Bahaya

    public LaporanKebakaranHutan(String lokasi, String tingkatBahaya) {
        super(lokasi); // Memanggil constructor superclass
        this.tingkatBahaya = tingkatBahaya;
    }

    public String getTingkatBahaya() { return tingkatBahaya; }
    public void setTingkatBahaya(String tingkatBahaya) { this.tingkatBahaya = tingkatBahaya; }

    // Polymorphism: Method Overriding
    @Override
    public void tampilkanDetail() {
        super.tampilkanDetail();
        System.out.println("Tingkat Bahaya: " + tingkatBahaya);
    }
}