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
public class main {
    static JenisLaundry daftarJenisLaundry = new JenisLaundry();
    static Client daftarClient = new Client();
    static Pekerja pekerja = new Pekerja ();
    static Transaksi transaksiLaundry = new Transaksi();
    static Laporan laporanLaundry = new Laporan();
    public static void main(String[] args) {
        System.out.println("=====LAUNDRY CLOUD=====");
        laporanLaundry.laporan(daftarClient);
        laporanLaundry.laporan(daftarJenisLaundry);
        System.out.println("===============================================================");
        transaksiLaundry.prosesTransaksi(daftarClient, transaksiLaundry, daftarJenisLaundry);
        System.out.println("===============================================================");
        laporanLaundry.laporan(transaksiLaundry, daftarJenisLaundry);
    }
}
