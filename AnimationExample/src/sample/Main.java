package sample;

import javafx.animation.FadeTransition;
import javafx.animation.FillTransition;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        //Field Transition, Transition from one color to another
        Circle c = new Circle(50,50,50);
        c.setFill(Color.FUCHSIA);
        c.setStroke(Color.CADETBLUE);
        c.setStrokeWidth(2);
        FillTransition ft = new FillTransition();
        ft.setDuration(Duration.millis(1000));

        ft.setCycleCount(1000);
        ft.setAutoReverse(true);
        ft.setFromValue(Color.ALICEBLUE);
        ft.setToValue(Color.HOTPINK);
        ft.setShape(c);
        ft.play();


        //Circle Fade
       /* Circle c = new Circle(50,50,50);
        c.setFill(Color.FUCHSIA);
        c.setStroke(Color.CADETBLUE);
        c.setStrokeWidth(2);
        FadeTransition fd = new FadeTransition();
        fd.setDuration(Duration.millis(1000));
        fd.setFromValue(10);
        fd.setToValue(0.1);
        fd.setCycleCount(1000);
        fd.setAutoReverse(true);
        fd.setNode(c);
        fd.play();*/

        //Circle Animation
        /*Circle c = new Circle(50,50,50);
        c.setFill(Color.FUCHSIA);
        c.setStroke(Color.CADETBLUE);
        c.setStrokeWidth(2);
        TranslateTransition tr = new TranslateTransition();
        tr.setByX(400); // specify length of X

        tr.setDuration(Duration.millis(1000));
        tr.setCycleCount(500);

        tr.setAutoReverse(true);
        tr.setNode(c);
        tr.play();
        Group group = new Group();
        group.getChildren().addAll(c);
        */

        // Rectangle animation
        /*Rectangle rect = new Rectangle(50, 50,200, 200);
        rect.setFill(Color.GREENYELLOW);
        RotateTransition rotate = new RotateTransition();
        rotate.setAxis(Rotate.Z_AXIS);
        rotate.setByAngle(360);
        rotate.setCycleCount(560);
        rotate.setDuration(Duration.millis(1000));
        rotate.setNode(rect);
        rotate.play();*/


        Group group = new Group();
        group.getChildren().addAll(c);
        primaryStage.setScene(new Scene(group, 400, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
