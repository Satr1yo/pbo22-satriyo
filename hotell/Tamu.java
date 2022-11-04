/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotell;

/**
 *
 * @author RIO
 */
public class Tamu {
    String nama,alamat,nik,notelp;
    
    public Tamu (String nama, String nik, String alamat, String notelp){
        this.nama = nama;
        this.alamat = alamat;
        this.nik = nik;
        this.notelp = notelp;
}       
    public void dataTamu (){ //fungsi
        System.out.println("Nama tamu  :" + nama);
         System.out.println("NIK tamu  :" + nik);
         System.out.println("alamat    :" + alamat);
         System.out.println("No telp   :" + notelp);
    }
    
}
