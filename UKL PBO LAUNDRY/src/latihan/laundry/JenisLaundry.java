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
public class JenisLaundry {
    
private ArrayList<String> namaJenisLaundry = new ArrayList<String>();
private ArrayList<Integer> harga = new ArrayList<Integer>();
private ArrayList<Integer> durasi = new ArrayList<Integer>(); 

public JenisLaundry(){
  setNamaJenisLaundry("Cuci Kering Reguler");
  setDurasi(3);
  setHarga(6000);
  
  setNamaJenisLaundry("Cuci Kering Kilat");
  setDurasi(2);
  setHarga(7500);
  
  setNamaJenisLaundry("Cuci Kering Express");
  setDurasi(1);
  setHarga(9000);
}
//Enkapsulasi: set dan get
    public int getJmlJenisLaundry(){
     return this.namaJenisLaundry.size();
     }

    public void setNamaJenisLaundry(String namaJenisLaundry) {
    this.namaJenisLaundry.add(namaJenisLaundry);
    }
    
    public String getNamaJenisLaundry(int idJenisLaundry){
    return this.namaJenisLaundry.get(idJenisLaundry);
    }
    
    public void setDurasi(int durasi) {
     this.durasi.add(durasi);
    }
    
    public int getDurasi(int idJenisLaundry){
    return this.durasi.get(idJenisLaundry);
    }
    
    public void editDurasi(int idJenisLaundry, int durasi){
    this.durasi.set(idJenisLaundry, durasi);
    }
    
    public void setHarga(int harga) {
    this.harga.add(harga);
    }
    
     public int getHarga(int idJenisLaundry){
    return this.harga.get(idJenisLaundry);
    }
}
