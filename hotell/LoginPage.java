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
import java.util.Scanner;
public class LoginPage {
    Scanner scanner = new Scanner (System.in);
    
    public LoginPage (){
        run();
}
    void run(){
        while (true) {
            loginMenu();
        }
    }
    void loginMenu () {
        String nip, password;
        boolean status = false;
        
        System.out.println("======= Login =====");
        
        System.out.println("NIP : ");
        nip = scanner.nextLine();
        
        System.out.println("Password : ");
        password = scanner.nextLine();
        
        status = Auth.login(nip, password);
        if (status) {
            System.out.println("Berhasil login....");
        } else {
            gagalLogin();
        }
    }
    
    void gagalLogin(){
        System.out.println("NIP atau password salah !");
    }
}
