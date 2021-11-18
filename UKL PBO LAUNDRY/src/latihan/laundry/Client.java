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
public class Client implements User{ //inheritance: implements dengan user
    
    private ArrayList<String> namaClient = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();

    public Client(){
    setNama("Ananda");
    setAlamat("Sukun");
    setTelepon("081216528384");
    setSaldo(700000);
    
    setNama("Gladis");
    setAlamat("Klojen");
    setTelepon("08993950809");
    setSaldo(600000);
    
    setNama("Claryta");
    setAlamat("Pakis");
    setTelepon("082200981967");
    setSaldo(900000);
}
 //Enkapsulasi: Set(mutator method) dan Get(accesor method)
    public void setSaldo(int saldo){
        this.saldo.add(saldo);
    }
    public int getSaldo(int idClient){
    return this.saldo.get(idClient);
    }
    public void editSaldo(int idClient, int saldo){
        this.saldo.set(idClient,saldo);
    }
    public int getJmlClient(){
    return this.saldo.size();
    }
    
     //Polimorphisme: overriding dengan user
    @Override
    public void setNama(String namaClient) {
        this.namaClient.add(namaClient);
    }

    @Override
    public void setAlamat(String alamat) {
         this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
         this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idClient) {
      return this.namaClient.get(idClient); 
    }

    @Override
    public String getAlamat(int idClient) {
      return this.alamat.get(idClient);
    }

    @Override
    public String getTelepon(int idClient) {
        return this.telepon.get(idClient);
    }
    
}
