/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author RIO
 */
import entity.Kamar;
import entity.Reservasi;
import entity.Staff;
import entity.Tamu;
import entity.Paket;
import java.util.ArrayList;
import utils.DateString;

public class Hotell {
    public static ArrayList<Kamar> daftarKamar = new ArrayList<>();
    public static ArrayList<Paket> daftarPaket = new ArrayList<>();
    public static ArrayList<Staff> daftarStaff = new ArrayList<>();
    public static ArrayList<Reservasi> daftarReservasi = new ArrayList<>();
    Kamar kamar = new Kamar();
    
    public static ArrayList<Kamar> getKamarList() {
     return daftarKamar;
    }
    
    public static ArrayList<Paket> getPaketList() {
     return daftarPaket;
    }
    public static void initialKamar() {
        daftarKamar.add(new Kamar("10", "Reguller Bed", 300000, true));
        daftarKamar.add(new Kamar("20", "Classic Bed", 500000, true));
        daftarKamar.add(new Kamar("30", "Luxury Bed", 700000, true));
        daftarKamar.add(new Kamar("40", "Elegant Room", 900000, true));
    }
    
    public static void initialPaket() {
        daftarPaket.add(new Paket("123","Breakfast", "Roti Panggang","Teh Hijau", 100000, true));
        daftarPaket.add(new Paket("231","Lunch", "Beef Steak","Fruit Juice", 150000, true));
        daftarPaket.add(new Paket("312","Dinner", "Lobster Mac and Cheese", "Milk Shake", 200000, true));
    }
   
    public static void initalStaff() {
        daftarStaff.add(new Staff("Rizky", "123", "1"));
        daftarStaff.add(new Staff("Dita", "321", "1"));
    }

    public static Kamar cariKamar(String kode) {
        for (Kamar kamar : daftarKamar) {
            if (kamar.getKodeKamar().equals(kode)) {
                return kamar;
            }
        }
        return null;
    }
    
    public static Paket cariPaket(String kode) {
        for (Paket paket : daftarPaket) {
            if (paket.getkodePaket().equals(kode)) {
                return paket;
            }
        }
        return null;
    }

    private static void updateStatusKamar(Kamar kamar, boolean status) {
        for (Kamar kamar2 : daftarKamar) {
            if (kamar.getKodeKamar().equals(kamar2.getKodeKamar())) {
                kamar2.setStatus(status);
                break;
            }
        }
    }

    public static void checkIn(Tamu tamu, Kamar kamar, int malam) {
        Reservasi checkIn = new Reservasi(tamu, kamar, malam);

        updateStatusKamar(kamar, false);

        daftarReservasi.add(checkIn);
    }

    public static int cariReservasibyKodeKamar(String kodeKamar) {
        int i = -1;
        for (Reservasi reservasi : daftarReservasi) {
            i += 1;
            if (reservasi.getKamar().getKodeKamar().equals(kodeKamar)) {
                if (!reservasi.getKamar().isStatus()) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void checkOut(int indexReservasi) {
        Reservasi reservasi = daftarReservasi.get(indexReservasi);
        reservasi.setTanggalCheckOut(DateString.now());
        Kamar kamar = reservasi.getKamar();
        updateStatusKamar(kamar, true);

        daftarReservasi.set(indexReservasi, reservasi);
    }
}

