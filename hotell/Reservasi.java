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
public class Reservasi {
    Tamu tamu;
    Kamar kamar;
    int malam;
    String tanggalCheckIn;
    String tanggalCheckOut;
    
    public Reservasi (Tamu tamu,Kamar kamar,int malam){
          this.tamu = tamu;
          this.kamar = kamar;
          this.malam = malam;
          this.tanggalCheckIn = DateString.now();
      }

    
    public void dataKamar (){
        tamu.dataTamu();
        kamar.dataKamar();
        System.out.println("malam            :" + malam);
        System.out.println("tanggal checkin  :" + tanggalCheckIn);
        System.out.println("tanggal checkout :" + tanggalCheckOut);
        
    }
    
}
