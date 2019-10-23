package sample;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Typing game");


        final String[] names = new String[] {"Calendar", "Contact", "Home"};
        final Image[] images = new Image[names.length];
        final ImageView[] icons = new ImageView[names.length];
        final CheckBox[] checkBoxes = new CheckBox[names.length];
        HBox hbox = new HBox();
        for(int i= 0; i<names.length; i++) {
            final Image image = images[i] = new Image(getClass()
                    .getResourceAsStream(names[i]+".png"));
            final ImageView icon = icons[i] = new ImageView();
            final CheckBox cb = checkBoxes[i] = new CheckBox(names[i]);
            cb.selectedProperty().addListener(new ChangeListener<Boolean>() {

                @Override
                public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                    icon.setImage(newValue ? image : null);
                }
            }
            );
            cb.setStyle(
                    "-fx-border-color: lightblue;" +
                            "-fx-font-size: 22px;" +
                            "fx-border-insets: -5;" +
                            "-fx-border-radius: 5;" +
                            "-fx-border-style: dotted;" +
                            "-fx-border-width: 2;"
            );
            hbox.getChildren().add(icon);
            hbox.getChildren().add(cb);
        }


        Scene scene = new Scene(hbox, 500, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

      //  primaryStage.setScene(new Scene(root, 300, 275));
       // primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
