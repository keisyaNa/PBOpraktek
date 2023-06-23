/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keisya.dao;
import java.util.List;
import java.util.ArrayList;
import keisya.model.Buku;
/**
 *
 * @author ACER
 */
public class BukuDaoImpl implements BukuDao{
    private List<Buku> data = new ArrayList<>();
    
    public BukuDaoImpl() {
        data.add(new Buku("A001","Dear J","Keisya","Gramedia Pustaka "));
        data.add(new Buku("A002","Hujan","Tere Liye","Gramedia Pustaka"));
    }
    
    public void insert(Buku buku){
        data.add(buku);
    }
    
    public void update(int index, Buku buku){
        data.set(index, buku);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Buku getBuku(int index){
        return data.get(index);
    }
    
    public List<Buku> getAll(){
        return data;
    }
}
