/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;


import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.*;
import view.Home;

public class Main extends javax.swing.JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        try {
//            UIManager.setLookAndFeel(new NimbusLookAndFeel());
//        } catch (UnsupportedLookAndFeelException e) {
//            e.printStackTrace();
//        }
        Home home = new Home();
        home.setVisible(true);
    }

}
