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
import java.util.Scanner;
public class Gaji2 {
    private String NIP;
    private String nama;
    private String golongan;
    private double gaji_pokok;
    private double tunjangan;
    private double total;

    public Gaji2(String NIP, String nama, String golongan) {
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
                gaji_pokok = 0;
            }
        }

        tunjangan = 0.05 * gaji_pokok;
        total = gaji_pokok + tunjangan;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
        hitungGaji();
    }

    public String getNIP() {
        return NIP;
    }

    public String getNama() {
        return nama;
    }

    public String getGolongan() {
        return golongan;
    }

    public double getGajiPokok() {
        return gaji_pokok;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public double getTotalGaji() {
        return total;
    }

    // Menampilkan seluruh data
    public void printInfoGaji() {
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + nama);
        System.out.println("Golongan: " + golongan);
        System.out.println("Gaji Pokok: " + gaji_pokok);
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Total Gaji: " + total);
    }

    public static void main(String[] args) {
        ArrayList<Gaji2> daftarGaji = new ArrayList<>();

        // Memasukkan data & Update Data
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah karyawan yang akan dicari datanya : ");
        int jumlahData = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Data Gaji ke-" + (i+1));
            System.out.print("NIP: ");
            String NIP = scanner.nextLine();
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Golongan 3A / 3B /3C :");
            String golongan = scanner.nextLine();

            Gaji2 gaji = new Gaji2(NIP, nama, golongan);
            daftarGaji.add(gaji);

            System.out.println(); 
        }

        // Menampilkan seluruh data
        for (Gaji2 gaji : daftarGaji) {
            gaji.printInfoGaji();
            System.out.println();
        }
    }
        }

