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
public class AdminPageController implements Initializable {

    @FXML
    private Button department;
    @FXML
    private Button teacher;
    @FXML
    private Button course;
    @FXML
    private Button room;
    @FXML
    private Button time;
    @FXML
    private Button day;
    @FXML
    private Button createRoutine;
    @FXML
    private Button Modify;
    @FXML
    private Button viewRoutine;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Department(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Department.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void ViewTeacher(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ViewTeachers.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void ViewCourse(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Courses.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void Room(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("RoomManagement.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void Time(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("TimeManagement.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void Day(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("DayManagement.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void CreateRoutine(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Routine.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void ModifyRoutine(ActionEvent event) {
    }

    @FXML
    private void ViewRoutine(ActionEvent event) {
    }
    
}
