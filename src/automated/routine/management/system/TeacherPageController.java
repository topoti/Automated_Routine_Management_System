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
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author A
 */
public class TeacherPageController implements Initializable {

    @FXML
    private Button courses;
    @FXML
    private Button teacher;
    @FXML
    private Button routine;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void viewTeachers(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ViewTeachers.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void viewCourses(ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Courses.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    
    }

    @FXML
    private void viewRoutine(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Routine.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
}
