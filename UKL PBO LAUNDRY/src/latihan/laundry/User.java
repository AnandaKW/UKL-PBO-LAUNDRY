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
public interface User {
    void setNama(String nama);
    void setAlamat(String alamat);
    void setTelepon(String telepon);
    
    String getNama(int id);
    String getAlamat(int id);
    String getTelepon(int id);
}
