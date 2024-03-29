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
import controller.Auth;
import entity.Kamar;
import java.util.Scanner;

import entity.Staff;
public class LoginPage {
    Scanner scanner = new Scanner(System.in);

    public LoginPage() {
        run();
    }

    private void run() {
        String str = """
                ================== NEO HOTEL  ================
                1. Masuk Staff
                0. Keluar
                ==============================================
                """;
        int menu = -1;

        do {
            System.out.print(str);
            System.out.print("Pilih : ");
            menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    loginMenu();
                    break;
                case 0:
                    System.out.println("Out");
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
            System.out.println();
        } while (menu != 0);
    }
    
    private void loginMenu() {
        String nip, password;
        boolean status = false;

        do {
            System.out.println("\n-------------------- LOGIN -------------------");

            System.out.print("NIP       : ");
            nip = scanner.nextLine();

            System.out.print("Password  : ");
            password = scanner.nextLine();

            status = Auth.login(nip, password);

            if (status) {
                System.out.println("----------------------------------------------");
                System.out.println("                Berhasil Login.               ");
                System.out.println("----------------------------------------------");
                System.out.println();
                new view.HomePage();
                break;
            } else {
                System.out.println("----------------------------------------------");
                System.out.println("          NIP atau password salah.            ");
                System.out.println("----------------------------------------------");
            }

        } while (status == false);
    }
}

