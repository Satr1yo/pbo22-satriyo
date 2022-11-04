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
public class Kamar {
    String KodeKamar;
    String JenisKamar;
    int hargaPerMalam;
    boolean status;
    
    public Kamar (String KodeKamar, String JenisKamar, int hargaPerMalam, boolean status){
        this.KodeKamar = KodeKamar;
        this.JenisKamar = JenisKamar;
        this.hargaPerMalam = hargaPerMalam;
        this.status = status;
    }
    public void dataKamar() {
        System.out.println("kode kamar     : "+ KodeKamar);
        System.out.println("jenis kamar    :" + JenisKamar);
        System.out.println("harga permalam :" + hargaPerMalam);
        System.out.println("status         :" + status);
}
}
