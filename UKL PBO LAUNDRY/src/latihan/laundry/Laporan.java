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
public class Laporan {
    
    public void laporan(JenisLaundry jenislaundry){
        int x=jenislaundry.getJmlJenisLaundry();
        
        System.out.println("Tabel Jenis Laundry");
       System.out.println("===============================================================");
        System.out.println("ID \t Jenis Laundry \t\tDurasi(hr) \t Harga/kg");
        for (int i=0; i<x; i++){
            System.out.println((i) +"\t"+ jenislaundry.getNamaJenisLaundry(i)+"\t"+
                                jenislaundry.getDurasi(i)+ "hr" + "\t\t"+jenislaundry.getHarga(i)+ "/kg");
        }
    }
    
    public void laporan(Client client){
        int x=client.getJmlClient();
        
        System.out.println("Tabel Client");
        System.out.println("===============================================================");
        System.out.println("ID \tNama \tAlamat \tTelepon \tSaldo");
        for (int i = 0; i < x; i++) {
            System.out.println(i + "\t"+ client.getNama(i)+"\t"+
               client.getAlamat(i)+"\t"+client.getTelepon(i)+"\t"+
               client.getSaldo(i));
    } 
    }
        public void laporan(Transaksi transaksi, JenisLaundry jenislaundry){
        int x=transaksi.getJmlTransaksi();

  System.out.println("Laporan Transaksi");
  System.out.println("ID \tJenis Laundry\t\tJumlah(kg) \tHarga/kg \tJumlah");

  int total=0;
  for (int i = 0; i < x; i++) {
   int jumlah=transaksi.getBanyaknya(i)*jenislaundry.getHarga(transaksi.getIdJenisLaundry(i));
   total+=jumlah;

   System.out.println((i+1) + "\t" + jenislaundry.getNamaJenisLaundry(transaksi.getIdJenisLaundry(i))+"\t"+
           transaksi.getBanyaknya(i)+ "kg"+ "\t" +"\t"+jenislaundry.getHarga(transaksi.getIdJenisLaundry(i))+ "/kg" + "\t" + "\t"
           + jumlah);
  }
  System.out.println();
  System.out.println("===============================================================");
  System.out.println("Total Omset : "+total);
}
}
