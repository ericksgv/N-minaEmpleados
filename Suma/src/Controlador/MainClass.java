/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author santi
 */
public class MainClass extends Application{

   
    
    public void start(Stage primaryStage){
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainClass.class.getResource("/Vista/SumaVista.fxml"));
            Pane ventana = (Pane) loader.load();
            Scene scene = new Scene(ventana);
            primaryStage.setScene(scene);
            primaryStage.show();
            
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
            
        }
        
        
    }
    public static void Main(String[] args) {
        launch(args);
        
        
    }
    
}
