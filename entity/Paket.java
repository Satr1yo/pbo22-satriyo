/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author RIO
 */
public class Paket{
      String kodePaket;
     String namaPaket;
    String makanan;
    String minuman;
    private int hargaPaket;
    private boolean status;
 
  

    public Paket() {
    }

    // Constructor
    public Paket(String kodePaket, String namaPaket, String makanan, String minuman,
            int hargaPaket, boolean status) {
        this.kodePaket = kodePaket;
        this.namaPaket = namaPaket;
        this.makanan = makanan;
        this.minuman = minuman;
        this.hargaPaket = hargaPaket;
         this.status = status;
    }

    // Method
    public void dataPaket() {
        System.out.println("Kode paket : " + kodePaket);
        System.out.println("Nama paket     : " + namaPaket);
        System.out.println("Makanan     : " + makanan);
        System.out.println("Minuman : " + minuman);
        System.out.println("Harga Paket          : " + hargaPaket);
        System.out.println("Status          : " + status);
    }
 public String getkodePaket() {
        return kodePaket;
    }

    public void setkodePaket(String kodePaket) {
        this.kodePaket = kodePaket;
    }
    public String getNamapaket() {
        return namaPaket;
    }

    public void setNamaPaket(String NamaPaket) {
        this.namaPaket = namaPaket;
    }

    public String getMakanan() {
        return makanan;
    }

    public void setMakanan(String Makanan) {
        this.makanan = makanan;
    }
    
     public String getMinuman() {
        return minuman;
    }

    public void setMinuman(String Minuman) {
        this.minuman = minuman;
    }

    public int getHargaPaket() {
        return hargaPaket;
    }

    public void setHargaPaket(int hargaPaket) {
        this.hargaPaket = hargaPaket;
    }
    
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


}