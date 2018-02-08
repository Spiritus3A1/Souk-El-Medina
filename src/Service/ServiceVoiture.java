/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;
import entities.Voiture;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.DataSource;
/**
 *
 * @author CHAIMA
 */
public class ServiceVoiture {
    public Connection con = DataSource.getInstance().getConnection() ;
    public Statement ste;
    
    public ServiceVoiture(){
        try {
            ste=con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(ServiceVoiture.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void AjouterVoiture(Voiture v) throws SQLException{
        String req="INSERT INTO Voiture (marque,couleur) VALUES(?,?)";
        PreparedStatement pre= con.prepareStatement(req);
        pre.setString(1,v.getMarque());
        pre.setString(2,v.getCouleur());
        pre.executeUpdate();
        System.out.println("Voiture ajoutée");
    }
}
