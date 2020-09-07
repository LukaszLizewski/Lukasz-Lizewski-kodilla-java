package com.kodilla.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class StackPaneController {

    @FXML
    private Button but;

    public StackPaneController() {
        System.out.println("Jestem kontrolerem");

    }
    @FXML
    public void initialize (){

       EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("to jest handler");
            }
        };
        but.addEventHandler(ActionEvent.ACTION, handler);

        EventHandler<MouseEvent> mouseHandlerLambda = e-> {
            System.out.println("to jest handler lambda");
        };

        EventHandler<MouseEvent> mouseHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("to jest mouse handler");
            }
        };
        but.addEventHandler(MouseEvent.MOUSE_ENTERED, mouseHandlerLambda);
        but.setOnAction(e->{
            System.out.println("to jest handler set onn");
            but.removeEventHandler(MouseEvent.MOUSE_ENTERED, mouseHandlerLambda);
        });

    }
}
