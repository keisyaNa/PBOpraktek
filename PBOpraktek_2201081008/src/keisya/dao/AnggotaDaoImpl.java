/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keisya.dao;
import java.util.List;
import java.util.ArrayList;
import keisya.model.Anggota;
/**
 *
 * @author LAB-MM
 */
public class AnggotaDaoImpl implements AnggotaDao {
    private List<Anggota> data = new ArrayList<>();
    
    public AnggotaDaoImpl() {
        data.add(new Anggota("A001","Ali","Padang","L"));
        data.add(new Anggota("A002","Budi","Padang","L"));
    }
    
    public void insert(Anggota anggota){
        data.add(anggota);
    }
    
    public void update(int index, Anggota anggota){
        data.set(index, anggota);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Anggota getAnggota(int index){
        return data.get(index);
    }
    
    public List<Anggota> getAll(){
        return data;
    }
}