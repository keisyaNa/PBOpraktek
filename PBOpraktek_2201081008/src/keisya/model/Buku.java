/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keisya.model;

/**
 *
 * @author ACER
 */
public class Buku {
    private String kodeBuku;
    private String judul;
    private String pengarang;
    private String penerbit;
    
    public Buku(){
    }
    
    public Buku(String kodeBuku, String judul, String pengarang,String penerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }
    
     public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getJudul() {
        return judul;
    }
    
    public void setJudul(String Judul) {
        this.judul = Judul;
    }

    public String getPengarang() {
        return pengarang;
    }
    
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
}

