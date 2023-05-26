/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A;

/**
 *
 * @author ACER
 */

import java.util.ArrayList;

public class Gaji {
    private final String NIP;
    private final String nama;
    private final String golongan;
    private double gaji_pokok;
    private double tunjangan;
    private double total;

    public Gaji(String NIP, String nama, String golongan) {
        this.NIP = NIP;
        this.nama = nama;
        this.golongan = golongan;
        hitungGaji();
    }

    private void hitungGaji() {
        switch (golongan) {
            case "3A" -> gaji_pokok = 1000000;
            case "3B" -> gaji_pokok = 2000000;
            case "3C" -> gaji_pokok = 3000000;
            default -> {
               
            }
        }

        tunjangan = 0.05 * gaji_pokok;
        total = gaji_pokok + tunjangan;
    }
    //menampilkan seluruh data
    public void printInfoGaji() {
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + nama);
        System.out.println("Golongan: " + golongan);
        System.out.println("Gaji Pokok: " + gaji_pokok);
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Total Gaji: " + total);
    }
  
   public static void main(String[] args) {
        ArrayList<Gaji> daftarGaji = new ArrayList<>();

        
        daftarGaji.add(new Gaji("2201081008", "Keisya Triandara Mawaddah", "3B"));
        daftarGaji.add(new Gaji("2201082001", "Amalia Yosandra", "3C"));
        daftarGaji.add(new Gaji("2201082022", "Na Jaemin", "3A"));

        
        for (Gaji gaji : daftarGaji) {
            gaji.printInfoGaji();
            System.out.println(); 
        }
    }
}
