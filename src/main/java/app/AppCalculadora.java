package app;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
        Button sumar = new Button("Sumar");
        Label resultado = new Label("");

        VBox contenedor = new VBox(10, label1, numero1, label2, numero2, sumar, resultado);

        contenedor.setPadding(new Insets(20));

        Scene escena = new Scene(contenedor, 300, 250);

        stage.setTitle("Mini-Calculadora");
        stage.setScene(escena);
        stage.show();

        sumar.setOnAction(event->{

            int num1 = Integer.parseInt(numero1.getText());
            int num2 = Integer.parseInt(numero2.getText());
            int res = num1 + num2;

            resultado.setText(String.valueOf(res));

        });
    }
}

