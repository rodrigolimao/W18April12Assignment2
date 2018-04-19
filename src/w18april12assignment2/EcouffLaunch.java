/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w18april12assignment2;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author rodrigolima
 */
public class EcouffLaunch extends Application{
    
    public static  void main(String[]args)
{
        launch(args);
}

    @Override
    public void start(Stage primaryStage) throws Exception 
    
    {
        //if you have a typo in the fie name, you will generate an exception
        //called location not set
        Parent root = FXMLLoader.load(getClass().getResource("Ecouff.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Athlete Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
