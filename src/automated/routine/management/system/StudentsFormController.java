/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automated.routine.management.system;

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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import automated.routine.management.system.database.DBConnect;

/**
 * FXML Controller class
 *
 * @author A
 */
public class StudentsFormController implements Initializable {

    DBConnect handler;
    @FXML
    private TextField sName;
    @FXML
    private TextField sId;
    @FXML
    private TextField sCGPA;
    @FXML
    private TextField sContact;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            handler= DBConnect.getInstance();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StudentsFormController.class.getName()).log(Level.SEVERE, null, ex);
        }
        handler.setStudentTable();
    }    

    @FXML
    private void register(ActionEvent event) {
        String Name=sName.getText();
        String Id=sId.getText();
        String CGPA=sCGPA.getText();
        String Contact=sContact.getText();
        Boolean flag=Name.isEmpty()||Id.isEmpty()||CGPA.isEmpty()||Contact.isEmpty();
        if(flag){
        Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Please enter in all fields");
            alert.showAndWait();
            return;
        }
        String st="Insert Into STUDENT Values("+
                "'"+Id+"',"+
                "'"+Name+"',"+
                "'"+CGPA+"',"+
                "'"+Contact+"'"+
                ")";
       System.out.println(st);
       if( handler.execAction(st)){
           Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("Registration Successfull");
            alert.showAndWait();
            
       }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Error occured");
            alert.showAndWait();
       }
    
    }

    @FXML
    private void alreadyMember(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("StudentLogIn.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
    }
    
}
