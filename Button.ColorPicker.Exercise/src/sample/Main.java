package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.sql.SQLOutput;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
      //  Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Color Picker Exercise");

        Button btn = new Button("Print");
        ColorPicker cp = new ColorPicker();
        Text text = new Text("Hello World");
        text.setFill(cp.getValue());



        cp.setOnAction(select -> {
         //  Text text = new Text("Hello World");
            // text.setFill(cp.getValue());
            btn.setOnAction(press->{
                text.setFill(cp.getValue());
            });


        });


        VBox vbox = new  VBox(btn, text, cp);
        Scene scene = new Scene(vbox, 300, 300);

        primaryStage.setScene(scene);
      //  primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
