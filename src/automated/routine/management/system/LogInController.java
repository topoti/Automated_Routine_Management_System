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
import javafx.scene.control.PasswordField;
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
public class LogInController implements Initializable {

    @FXML
    private TextField usernameIdLogin;
    @FXML
    private PasswordField passwordIdLogin;
    @FXML
    private Button loginButtonLogin;
    @FXML
    private Label LogInMessageId;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Login(MouseEvent event) throws SQLException, ClassNotFoundException, IOException {
        String username = usernameIdLogin.getText();
        String password = passwordIdLogin.getText();
        
        DBConnect db = new DBConnect();
        int rs = db.userLogin(username, password);
        
        if (rs == 1) {
        Parent root = FXMLLoader.load(getClass().getResource("User_Choice.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        }
        else {
            String message = LogInMessageId.getText();
            LogInMessageId.setText("Incorrect Username or Password....!");
            LogInMessageId.setTextFill(Color.web("#fc0324"));
        }
    }
    
}
