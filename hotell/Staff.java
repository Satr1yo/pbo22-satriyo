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
public class Staff {
     String nama; 
     String nip; 
     String password;

      public Staff (String nama,String nip,String password){
          this.nama = nama;
          this.nip = nip;
          this.password = password;
      }
         public void dataStaff() {
         System.out.println("Nama staff :" + nama);
         System.out.println("NIP Staff  :" + nip);
         System.out.println("password   :" + password);
}
    
}
