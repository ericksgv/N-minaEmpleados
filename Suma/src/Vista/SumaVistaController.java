/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import Modelo.Sumas;
import javafx.scene.control.Alert;

/**
 * FXML Controller class
 *
 * @author santi
 */
public class SumaVistaController implements Initializable {

    @FXML
    private TextField txtOp1;
    @FXML
    private TextField txtOp2;
    @FXML
    private Button btnSumar;
    @FXML
    private TextField txtRes;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Sumar(ActionEvent event) {
        try{
        int op1 = Integer.parseInt(txtOp1.getText());
        int op2 = Integer.parseInt(txtOp2.getText());
        Sumas suma = new Sumas(op1, op2);
        int resultado = suma.sumar();
        txtRes.setText(resultado + "");
        }
        catch(NumberFormatException e)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Error de datos");            
            alert.setTitle("Error");
            alert.setContentText("Ingresa un numero entero");
            alert.showAndWait();
        }
    }
    
}
