package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.time.LocalDate;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Date Picker");

        //This is for Selecting dates
        DatePicker datePicker = new DatePicker();
        Button btn = new Button("Read Date");
        btn.setOnAction(action ->{
            //Select date for us
            LocalDate value = datePicker.getValue();
            System.out.println(value.toString());
        });


       HBox hbox = new HBox(datePicker, btn);

        /*//Color picker used to select different colors  **Use this code to find out different colors
        ColorPicker colorPicker = new ColorPicker();
        VBox vbox = new VBox(colorPicker);*/

        Scene scene = new Scene(hbox, 500, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
