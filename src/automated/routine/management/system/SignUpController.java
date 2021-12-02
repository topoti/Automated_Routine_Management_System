/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automated.routine.management.system;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import automated.routine.management.system.database.DBConnect;

/**
 * FXML Controller class
 *
 * @author A
 */
public class SignUpController implements Initializable {

    @FXML
    private TextField usernameIdRegi;
    @FXML
    private PasswordField passwordIdRegi;
    @FXML
    private Button signUpButtonIdRegi;
    @FXML
    private Label regiStatusMsg;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void SignUp(MouseEvent event) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        String username = usernameIdRegi.getText();
        String password = passwordIdRegi.getText();
        
        DBConnect db = new DBConnect();
        int rs = db.setUserData(username, password);
        
        if (rs==0) {
            regiStatusMsg.setText("Registration Success.");
           regiStatusMsg.setTextFill(Color.web("#0f8518"));
        }
        if (rs==1) {
            regiStatusMsg.setText("Username already taken.");
            regiStatusMsg.setTextFill(Color.web("#fc0324"));
        }
    }
}
