/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piexple;

import Service.ServiceVoiture;
import entities.Voiture;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CHAIMA
 */
public class PiExple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture v=new Voiture(1, "audi","noir");
        ServiceVoiture sv = new ServiceVoiture();
        try {
            sv.AjouterVoiture(v);
        } catch (SQLException ex) {
            Logger.getLogger(PiExple.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
