package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Main extends Application {
    public void start(Stage primaryStage) throws Exception {
        // Se crea el primer botón con texto "Boton1"
        Button boton = new Button("Boton1");

        // Se crea el segundo botón con texto "Boton2"
        Button boton2 = new Button("Boton2");

        // Estilo CSS: fondo azul claro para el primer botón
        boton.setStyle("-fx-background-color: Lightblue");
        // Fuente del primer botón: Comic Sans MS, negrita, tamaño 20
        boton.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20));

        // Estilo CSS: fondo verde claro para el segundo botón
        boton2.setStyle("-fx-background-color: Lightgreen");
        // Fuente del segundo botón: Brush Script MT, normal, tamaño 20
        boton2.setFont(Font.font("Brush Script MT", FontWeight.NORMAL, 20));

        // Contenedor horizontal HBox que agrupa boton y boton2 uno al lado del otro
        HBox hBox = new HBox(boton, boton2);
        // Se crea el tercer botón con texto "Boton3"
        Button boton3 = new Button("Boton3");

        // Estilo CSS: fondo de color hexadecimal #f95959 (rojizo) para el tercer botón
        boton3.setStyle("-fx-background-color: #f95959");
        // Fuente del tercer botón: Impact, normal, tamaño 20
        boton3.setFont(Font.font("Impact", FontWeight.NORMAL, 20));

        // Contenedor vertical VBox que coloca primero el HBox (botón1 y botón2) y debajo boton3
        VBox vBox = new VBox(hBox, boton3);

        // Se crea la escena con el VBox como raíz, de 300x300 píxeles
        Scene scene = new Scene(vBox, 300, 300);

        // Se asigna el título a la ventana principal
        primaryStage.setTitle("Botones JavaFX");
        // Se coloca la escena en el escenario (ventana)
        primaryStage.setScene(scene);
        // Se hace visible la ventana
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Lanza la aplicación JavaFX (método heredado de Application)
        launch(args);
    }
}