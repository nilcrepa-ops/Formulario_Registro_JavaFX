
package com.creus.login.login_register_creus.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Login_gridController implements Initializable {


    @FXML
    private ImageView imgSegurata;
    @FXML
    private Button btnRegister;
    @FXML
    private Button btnMagico;
    @FXML
    private Label lblInfo;
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtId;
    @FXML
    private TextField txtPostal;
    @FXML
    private TextField txtBirth;
    @FXML
    private TextField txtMail;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    private void pulsarRegister(){ //Funcion para probar. Si pulsas register cambia la imagen
        Image imgSi = new Image(getClass().getResourceAsStream("/img/segurata_si.png"));
        imgSegurata.setImage(imgSi);
    }

    
}
