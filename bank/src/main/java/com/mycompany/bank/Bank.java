package com.mycompany.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Bank {

     public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BankScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        String jdbcURL = "jdbc:mysql://localhost:3030/BankDB";
        String username = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankScreen(connection).setVisible(true);
            }
        });
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
