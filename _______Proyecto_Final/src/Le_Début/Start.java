package Le_Début;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Start extends Application{ // esta heredando de Application
    
    public static void main(String[] args) {
        
        launch(args);
        
    }
    
    public void start (Stage ventana) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/La_Vue/Menu.fxml")); //Arma la ventana con el XML
        Scene scene = new Scene(root);
        ventana.setScene(scene);
        
        //ventana.setFullScreen(true);
        ventana.setTitle("Le titre");
        ventana.setResizable(false);  // No se puede cambiar el tamaño de la ventana
        ventana.setOnCloseRequest(event -> {event.consume();});
      
        
        ventana.show();   //Muestra la ventana
    }
    
}
