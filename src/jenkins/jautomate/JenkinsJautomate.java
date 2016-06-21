/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jenkins.jautomate;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import jenkins.jautomate.GUI.FrmMain;

/**
 *
 * @author fachrulpbm
 */
public class JenkinsJautomate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(JenkinsJautomate.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmMain fu = new FrmMain();
                fu.setExtendedState(fu.getExtendedState() | JFrame.MAXIMIZED_BOTH);
                fu.setVisible(true);
            }
        });
    }
    
}
