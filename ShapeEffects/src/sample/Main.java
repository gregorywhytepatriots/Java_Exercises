package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        // Text Shape and colors
        Group root = new Group();
        Text txt = new Text();
        txt.setText("Hello World");
        txt.setX(100);
        txt.setY(100);
        txt.setFont(Font.font("Caliber", FontWeight.BOLD, FontPosture.ITALIC, 20));
        txt.setFill(Color.GREENYELLOW);
        txt.setStroke(Color.GREEN);
        txt.setUnderline(true);

        BoxBlur bx = new BoxBlur();
        bx.setHeight(5);
        bx.setWidth(2);
        bx.setIterations(3);
        txt.setEffect(bx);

        root.getChildren().addAll(txt);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();


        // rectangular effects
        /*Group root = new Group();
        Rectangle rect1 = new Rectangle(50,50,150,200);
        Rectangle rect2 = new Rectangle(325,50,150,200);
        rect1.setFill(Color.HOTPINK);
        rect1.setStroke(Color.GREENYELLOW);
        rect1.setStrokeWidth(5);
        rect2.setFill(Color.GREENYELLOW);
        rect2.setStroke(Color.BLUE);
        rect2.setStrokeWidth(5);
        Bloom bm = new Bloom();
        bm.setThreshold(0.2);
        rect1.setEffect(bm);
        root.getChildren().addAll(rect1, rect2);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();*/

       // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        //bLEND EFFECTS FOR COLOR USING A CIRCLE SHAPE
        /*Group root = new Group();
        Circle c = new Circle(150,200,120);
        c.setFill(Color.HOTPINK);
        Blend blend = new Blend();
        ColorInput ci = new ColorInput(70,20,100,150,Color.DARKBLUE);
        blend.setTopInput(ci);
        blend.setMode(BlendMode.SOFT_LIGHT);
        c.setEffect(blend);

        root.getChildren().addAll(c);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();*/

    }


    public static void main(String[] args) {
        launch(args);
    }
}
