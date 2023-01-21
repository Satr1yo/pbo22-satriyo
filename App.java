/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import view.LoginPage;
import view.auth.LoginFrame;
import model.Hotell;
import view.LoginPage;
/**
 * @author RIO
 */

public class App {
    public static void main(String[] args) {
        Hotell.initalStaff();
        Hotell.initialKamar();
        new view.LoginPage();
    //new LoginFrame().setVisible(true);
    } 
}
