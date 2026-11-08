package app;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class AppCalculadora extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Label label1 = new Label("Primer número");
        TextField numero1 = new TextField();
        Label label2 = new Label("Segundo número");
        TextField numero2 = new TextField();

        VBox contenedor = new VBox(10, label1, numero1, label2, numero2);

        contenedor.setPadding(new Insets(20));

        Scene escena = new Scene(contenedor, 300, 150);

        stage.setTitle("Mini-Calculadora");
        stage.setScene(escena);
        stage.show();





    }
}

