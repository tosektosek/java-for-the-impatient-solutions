package com.company.r03_interfejsy_i_wyrazenia_lambda.code.sec4;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.*;
/**
 * @author Kamil
 */
public class ButtonDemo extends Application{
    @Override
    public void start(Stage stage) throws Exception {

        Button button = new Button("OK");
        button.setOnAction(event -> System.out.println("Thanks"));
        Label message = new Label("Hello, JavaFX!");
        message.setFont(new Font(100));
        VBox root = new VBox();
        root.getChildren().addAll(button, message);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
