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
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author A
 */
public class UserChoiceController implements Initializable {

    @FXML
    private CheckBox teacher;
    @FXML
    private CheckBox student;
    @FXML
    private CheckBox admin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
     @FXML
    private void nextPage(ActionEvent event) throws IOException {
        if(teacher.isSelected()){
          Parent root = FXMLLoader.load(getClass().getResource("TeacherPage.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        }
        else if(student.isSelected()){
            Parent root = FXMLLoader.load(getClass().getResource("Students.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        }
        else{
            Parent root = FXMLLoader.load(getClass().getResource("AdminPage.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        }
    }
}
