/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.laundry;

/**
 *
 * @author ANANDA
 */
import java.util.ArrayList;
public class Pekerja implements User{ //Inheritance: implements

    private ArrayList<String> namaPekerja = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();

    public Pekerja(){
        this.namaPekerja.add("admin");
        this.alamat.add("Rampal Celaket");
        this.telepon.add("081234567890");
        this.jabatan.add(0);
    }
    
    //Enkapsulasi: Set(mutator method) dan Get(accesor method)
    public void setJabatan(int jabatan){
        this.jabatan.add(jabatan);
    }
    
    public int getJabatan(int id){
        return this.jabatan.get(id);
    }
    
    public int getJmlPekerja(){
    return this.namaPekerja.size();
}
    //Polimorphisme: overriding dengan user
    @Override
    public void setNama(String namaPekerja) {
    this.namaPekerja.add(namaPekerja);
    }

    @Override
    public void setAlamat(String alamat) {
    this.namaPekerja.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
    this.namaPekerja.add(telepon);
    }

    @Override
    public String getNama(int idPekerja) {
    return this.namaPekerja.get(idPekerja);
    }

    @Override
    public String getAlamat(int idPekerja) {
    return this.alamat.get(idPekerja);
    }

    @Override
    public String getTelepon(int idPekerja) {
    return this.telepon.get(idPekerja);
    }
    
}
