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

        Button boton = new Button("Boton1");

        Button boton2 = new Button("Boton2");

        boton.setStyle("-fx-background-color: Lightblue");
        boton.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20));

        boton2.setStyle("-fx-background-color: Lightgreen");
        boton2.setFont(Font.font("Brush Script MT", FontWeight.NORMAL, 20));

        HBox hBox = new HBox(boton,boton2);
        Button boton3 = new Button("Boton3");

        boton3.setStyle("-fx-background-color: #f95959");
        boton3.setFont(Font.font("Impact", FontWeight.NORMAL, 20));


        VBox vBox = new VBox(hBox, boton3);


        Scene scene = new Scene(vBox,300,300);

        primaryStage.setTitle("Botones JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
