package com.kodilla.first;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.awt.*;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        StackPane stackPane = new StackPane();
        Button button = new Button("Przycisk");
        stackPane.getChildren().add(button);

        Scene scene = new Scene(stackPane, 400, 600);


        primaryStage.setScene(scene);
        primaryStage.setWidth(200);
        primaryStage.setHeight(200);

//        primaryStage.setFullScreen(true);
//        primaryStage.setX(100);
//        primaryStage.setY(1000);
        primaryStage.setOpacity(1);
        primaryStage.setTitle("pierwwsze okno");
        primaryStage.show();

    }
}
