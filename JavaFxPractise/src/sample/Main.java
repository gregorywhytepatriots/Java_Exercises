package sample;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Typing game");
        Label label = new Label();
        final ToggleGroup group = new ToggleGroup();

        RadioButton rdb1 = new RadioButton();
        rdb1.setToggleGroup(group);
        rdb1.setText("Home");
        rdb1.setSelected(true);
        RadioButton rdb2 = new RadioButton();
        rdb2.setText("Calendar");
        rdb2.setToggleGroup(group);
        RadioButton rdb3 = new RadioButton("Contact");
        rdb3.setToggleGroup(group);
        rdb1.setUserData("Home");
        rdb2.setUserData("Calendar");
        rdb3.setUserData("Contact");
        ImageView iv = new ImageView();
        HBox hbox = new HBox(rdb1, rdb2, rdb3, label, iv);
        group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> observable,
                                Toggle oldValue, Toggle newValue) {
                if(group.getSelectedToggle() != null) {
                    //label.setText(group.getSelectedToggle().getUserData().toString());
                    final Image img = new Image(getClass().getResourceAsStream(
                            group.getSelectedToggle().getUserData().toString()+".png"));
                    iv.setImage(img);
                }
            }
        });
        Scene scene = new Scene(hbox, 500, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}