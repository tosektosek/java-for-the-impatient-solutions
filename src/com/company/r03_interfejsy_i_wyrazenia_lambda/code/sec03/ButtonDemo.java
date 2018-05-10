package com.company.r03_interfejsy_i_wyrazenia_lambda.code.sec03;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.*;

/**
 * @author Kamil
 */
public class ButtonDemo extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Button cancelButton = new Button("Cancel");
        cancelButton.setOnAction(event -> System.out.println("OHHHH"));

        Label message = new Label("Hello, JavaFX!");
        message.setFont(new Font(100));
        VBox root = new VBox();
        root.getChildren().addAll(cancelButton, message);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

class CancelAction implements EventHandler<ActionEvent> {
    public void handle(ActionEvent event) {
        System.out.println("Oh noes!");
    }
}
