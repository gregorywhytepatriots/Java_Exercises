package sample;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        ToggleButton btn1 = new ToggleButton();
        ToggleButton btn2 = new ToggleButton( "press me ");
        Image icon = new Image(getClass().getResourceAsStream("Home.png"));
        ToggleButton btn3 = new ToggleButton("press me, too", new ImageView());
        final ToggleGroup group = new ToggleGroup();
        btn1.setToggleGroup(group);
        btn2.setToggleGroup(group);
        btn3.setToggleGroup(group);
        btn3.setUserData(true);

        btn1.setUserData(Color.LAVENDER);
        btn2.setUserData(Color.FUCHSIA);
        btn3.setUserData(Color.SADDLEBROWN);
        Dimensions dim = new Dimensions();
        final Rectangle rect = new Rectangle( 150, 50);


        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
