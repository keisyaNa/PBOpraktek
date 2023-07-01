/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keisya.dao;
import java.util.List;
import java.util.ArrayList;
import keisya.model.Peminjaman;
/**
 *
 * @author ACER
 */
public abstract class PeminjamanDaoImpl implements PeminjamanDao{
    private List<Peminjaman> data = new ArrayList<>();
    
    public PeminjamanDaoImpl() {
        data.add(new Peminjaman("A001","Dear J","1 Juli 2023","8 Juli 2023 "));
        data.add(new Peminjaman("A002","Hujan","5 Agustus 2022","12 Agustus 2022"));
    }
    
    public void insert(Peminjaman peminjaman){
        data.add(peminjaman);
    }
    
    public void update(int index, Peminjaman peminjaman){
        data.set(index, peminjaman);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Peminjaman getPeminjaman(int index){
        return data.get(index);
    }
    
    public List<Peminjaman> getAll(){
        return data;
    }
}
