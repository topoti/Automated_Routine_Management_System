/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automated.routine.management.system;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author A
 */
public class StudentsController implements Initializable {

    @FXML
    private TextField yId;
    @FXML
    private TextField sId;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void continuenext(ActionEvent event) throws IOException {
        if(("3".equals(yId.getText()) && "2".equals(sId.getText()))||
                "1".equals(yId.getText()) ||
                ("2".equals(yId.getText()) && "2".equals(sId.getText()))){
            Parent root = FXMLLoader.load(getClass().getResource("noProject.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        }
        else if("2".equals(yId.getText()) && "1".equals(sId.getText())){
            Parent root = FXMLLoader.load(getClass().getResource("projectList21.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } 
        else if("3".equals(yId.getText()) && "1".equals(sId.getText())){
            Parent root = FXMLLoader.load(getClass().getResource("projectList31.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }
        else{
            Parent root = FXMLLoader.load(getClass().getResource("StudentsForm.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }
    }
}
