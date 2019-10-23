package sample;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");

        // ComboBox is a dropdown list
        ComboBox cb = new ComboBox();
        cb.getItems().add("Choice 1");
        cb.getItems().add("Choice 2");
        cb.getItems().add("Choice 3");

        ListView listView = new ListView();
        listView.getItems().add("Greg");
        listView.getItems().add("Tom");
        listView.getItems().add("Riz");
        listView.getItems().add("Kelly");
        listView.getItems().add("Tommy");

        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        Button btn = new Button("Select student");
        btn.setOnAction(event -> {
            ObservableList selectedItems = listView.getSelectionModel().getSelectedIndices();
            for(Object o : selectedItems){
                System.out.println(" o = "+ o + "("+ o.getClass() + ")");
            }
        });

        HBox hbox = new HBox(cb,listView, btn);
        String value = (String) cb.getValue();
        cb.setEditable(true);
        Scene scene = new Scene(hbox, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
