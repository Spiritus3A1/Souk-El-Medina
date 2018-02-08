/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Service.ServiceVoiture;
import entities.Voiture;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author CHAIMA
 */
public class AjoutVoitureController implements Initializable {

    @FXML
    private TextField MarqueTxt;
    @FXML
    private TextField CouleurTxt;
    @FXML
    private Button AjoutBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    @FXML
    public void AjouterVoiture(ActionEvent event) throws IOException {
        Voiture v = new Voiture(MarqueTxt.getText(),CouleurTxt.getText());
        ServiceVoiture sv = new ServiceVoiture();
       
        try {
            sv.AjouterVoiture(v);
        
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Succes.fxml"));
            Parent root = loader.load();
            SuccesController sc = loader.getController();
            sc.setSucces("Voiture : -"+MarqueTxt.getText()+" "+CouleurTxt.getText()+"- ajoutée avec succés");
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
                /*  Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("info");
                alert.setHeaderText("Ajout");
                alert.setContentText("Voiture ajoutée avec succés");
                alert.show();*/
                } catch (SQLException ex) {
            Logger.getLogger(AjoutVoitureController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
