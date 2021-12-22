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
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author A
 */
public class CoursesController implements Initializable {

    @FXML
    private CheckBox choicebox1;
    @FXML
    private CheckBox choicebox2;
    @FXML
    private CheckBox choicebox3;
    @FXML
    private CheckBox choicebox4;
    @FXML
    private CheckBox choicebox5;
    @FXML
    private CheckBox choicebox6;
    @FXML
    private CheckBox choicebox7;
    @FXML
    private CheckBox choicebox8;
    @FXML
    private Button continueButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void nextpage(ActionEvent event) throws IOException {
        if(choicebox1.isSelected()){
          Parent root = FXMLLoader.load(getClass().getResource("first_first.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        }
        else if(choicebox2.isSelected()){
            Parent root = FXMLLoader.load(getClass().getResource("First_second.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        }
        else if(choicebox3.isSelected()){
            Parent root = FXMLLoader.load(getClass().getResource("Second_first.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        }
         else if(choicebox4.isSelected()){
            Parent root = FXMLLoader.load(getClass().getResource("Second_second.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        }
         else if(choicebox5.isSelected()){
            Parent root = FXMLLoader.load(getClass().getResource("Third_first.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        }
         else if(choicebox6.isSelected()){
            Parent root = FXMLLoader.load(getClass().getResource("Third_second.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        }
         else if(choicebox7.isSelected()){
            Parent root = FXMLLoader.load(getClass().getResource("Fourth_first.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        }
         else {
            Parent root = FXMLLoader.load(getClass().getResource("Fourth_second.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        }
    }
    }
    

