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
public class Auth {
    static Staff  staffLogged = null;
    
    public static Staff getStaffLoged() {
        return staffLogged;
    }
    
    public static boolean login(String nip, String password){
        if ((Hotell.staffAktif.nip.equals(nip)) &&
                (Hotell.staffAktif.password.equals(password))) {
            staffLogged = Hotell.staffAktif;
            return true;
            
        }else {
            return false;
        }
    }
    
    public static void logout(){
        
    }
}
