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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import automated.routine.management.system.database.DBConnect;

/**
 * FXML Controller class
 *
 * @author A
 */
public class StudentLogInController implements Initializable {

    @FXML
    private Label LogInMessageId;
    @FXML
    private Button loginButtonLogin;
    @FXML
    private TextField studentId;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void Login(MouseEvent event) throws IOException, ClassNotFoundException, SQLException {
        String ID = studentId.getText();
        
        
        DBConnect db = new DBConnect();
        int rs = db.userLoginStudent(ID);
        
        if (rs == 1) {
        Parent root = FXMLLoader.load(getClass().getResource("StudentProfile.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        }
        else {
            String message = LogInMessageId.getText();
            LogInMessageId.setText("Incorrect ....!");
            LogInMessageId.setTextFill(Color.web("#fc0324"));
        }
    
    }
    
}
