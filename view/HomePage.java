/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author RIO
 */
import java.util.Scanner;
import entity.Paket;
import entity.Kamar;
import entity.Reservasi;
import entity.Tamu;
import model.Hotell;

public class HomePage {
    private Scanner scanner = new Scanner(System.in);

    public HomePage() {
        run();
    }

    private void run() {
        System.out.println("============== NEO HOTEL =====================");              
        System.out.println("1. Check In");
        System.out.println("2. Check Out");       
        System.out.println("3. Daftar Reservasi");   
        System.out.println("4. Paket Makanan Hotel");
        System.out.println("0. Keluar");
        System.out.println("==============================================");        

        int menu = -1;

        do {
            System.out.print("Pilih: ");
            menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    checkIn();
                    break;
                case 2:
                    checkOut();
                    break;
                case 3:
                    daftarReservasi();
                    break;
                case 4:
                    pilihpaket();
                case 0:
                    System.out.println("Keluar");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }

        } while (menu != 0);
    }

    private void checkIn() {
        System.out.println("------------------ RESERVASI -----------------");
        System.out.println("------------------ CHECK  IN -----------------");

        String nik, nama, alamat, noTelp;

        System.out.print("Masukan NIK Tamu    : ");
        nik = scanner.nextLine();

        System.out.print("Masukan Nama Tamu   : ");
        nama = scanner.nextLine();

        System.out.print("Masukan Alamat Tamu : ");
        alamat = scanner.nextLine();

        System.out.print("Masukan No Telp Tamu: ");
        noTelp = scanner.nextLine();

        Kamar kamar = pilihKamar();

        System.out.print("Berapa Malam        : ");
        int malam = scanner.nextInt();
        scanner.nextLine();

        Tamu tamu = new Tamu(nik, nama, alamat, noTelp);

        Hotell.checkIn(tamu, kamar, malam);
    }

    private Kamar pilihKamar() {
        boolean pilihKamarStatus = false;
        String kodeKamar;
        Kamar kamar;

        do {
            System.out.print("  Masukan Kode Kamar    : ");
            kodeKamar = scanner.nextLine();
            kamar = Hotell.cariKamar(kodeKamar);

            if (kamar != null) {
                if (kamar.isStatus()) {
                    char pilihKamarIni = 'n';

                    System.out.println("    Kode Kamar      : " + kamar.getKodeKamar());
                    System.out.println("    Jenis Kamar     : " + kamar.getJenisKamar());
                    System.out.println("    Harga Permalam  : " + kamar.getHargaPerMalam());

                    System.out.print("  Pilih Kamar ini (y/n) : ");
                    pilihKamarIni = scanner.nextLine().charAt(0);

                    if (pilihKamarIni == 'y') {
                        pilihKamarStatus = true;
                        break;
                    }

                } else {
                    System.out.println("------------- KAMAR TELAH DIPESAN ------------");
                }
            } else {
                System.out.println("------------ KAMAR TIDAK DITEMUKAN -----------");
            }
        } while (pilihKamarStatus == false);

        return kamar;
    }
 
    private void checkOut() {
        System.out.println("------------------ RESERVASI -----------------");
        System.out.println("------------------ CHECK OUT -----------------");

        String kodeKamar;

        System.out.print("Input Kode Kamar  : ");
        kodeKamar = scanner.nextLine();

        int indexReservasi = Hotell.cariReservasibyKodeKamar(kodeKamar);
        if (indexReservasi > -1) {
            Hotell.checkOut(indexReservasi);

            System.out.println("CHECK OUT SELESAI");
            System.out.println("Terima Kasih telah berkunjung");
        } else {
            System.out.println("Data Tidak Ditemukan !");
        }
    }
    private Paket pilihpaket() {
        boolean pilihPaketStatus = false;
        String kodePaket;
        Paket paket;
        do {
            System.out.print("  Masukan Kode Paket    : ");
            kodePaket = scanner.nextLine();
            paket = Hotell.cariPaket(kodePaket);

            if (paket != null) {
                if (paket.isStatus()) {
                    char pilihPaketIni = 'n';
                    System.out.println("    Kode Paket      : " + paket.getkodePaket());
                    System.out.println("    Nama Paket      : " + paket.getNamapaket());
                    System.out.println("    Makanan yang didapat      : " + paket.getMakanan());
                    System.out.println("    Minuman yang didapat      : " + paket.getMinuman());
                    System.out.println("    Harga Paket  : " + paket.getHargaPaket());

                    System.out.print("  Pilih Paket makanan ini (y/n) : ");
                    pilihPaketIni = scanner.nextLine().charAt(0);

                    if (pilihPaketIni == 'y') {
                        pilihPaketStatus = true;
                        break;
                    }

                } else {
                    System.out.println("------------- PAKET MAKANAN DIPESAN ------------");
                }
            } else {
                System.out.println("------------ PAKET MAKANAN TIDAK DITEMUKAN -----------");
            }
        } while (pilihPaketStatus == false);

        return paket;
    }

    private void daftarReservasi() {
        for (Reservasi reservasi : Hotell.daftarReservasi) {
            System.out.println("==============================================");
            System.out.println("Input Kode Kamar      : " + reservasi.getKamar().getKodeKamar());
            System.out.println("Input Jenis Kamar     : " + reservasi.getKamar().getJenisKamar());
            System.out.println("----------------------------------------------");
            System.out.println("NIK Tamu        : " + reservasi.getTamu().getNik());
            System.out.println("Nama Tamu       : " + reservasi.getTamu().getNama());
            System.out.println("No Telp Tamu    : " + reservasi.getTamu().getNoTelp());
            System.out.println("----------------------------------------------");
            System.out.println("Tanggal CheckIn : " + reservasi.getTanggalCheckIn());
            System.out.println("Malam           : " + reservasi.getMalam());
            System.out.println("Tanggal CheckOut: " + reservasi.getTanggalCheckIn());
            System.out.println("==============================================");
        }
    }

}
