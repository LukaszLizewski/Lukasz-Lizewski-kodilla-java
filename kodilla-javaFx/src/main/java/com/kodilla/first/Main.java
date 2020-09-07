package com.kodilla.first;

import com.kodilla.controller.StackPaneController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
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

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource("/fxml/StackPane.fxml"));
        GridPane stackPane = loader.load();

        //StackPaneController controller = loader.getController();

        Scene scene = new Scene (stackPane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("pierwwsze okno");
        primaryStage.show();

    }
}
