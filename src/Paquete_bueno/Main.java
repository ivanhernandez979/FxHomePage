package Paquete_bueno;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * @author ivan hernandez
 * @version 1
 * @see Controlador
 * 
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader loader =new FXMLLoader(getClass().getResource("Edit.fxml"));
        AnchorPane pane=loader.load();
        Scene scene=new Scene(pane);
        scene.getStylesheets().addAll(getClass().getResource("Style.css").toExternalForm());
        primaryStage.setTitle("Apple.com");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    
    public static void main(String[] args) {
        launch(args);
    }
}