package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.image.Image;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        primaryStage.setTitle("Cubic Curves");
        Image img1 = new Image("/sample/Dog.jpeg");
        Image img2 = new Image("/sample/Dog2.jpeg");
        ImageView iv1 = new ImageView(img1);
        ImageView iv2 = new ImageView(img2);
        Text text = new Text();
        Text text2 = new Text();

        text.setText("Color Adjustment applied");
        text.setText("Color Adjustment  not applied");
        text.setX(50);
        text.setY(100);
        text2.setX(55);
        text2.setY(100);

        iv1.setX(100);
        iv1.setY(90);
        iv2.setX(400);
        iv2.setY(90);
        ColorAdjust ca = new ColorAdjust();
        ca.setBrightness(0.2);
        ca.setBrightness(0.2);
        ca.setContrast(0.45);
        iv1.setEffect(ca);
        root.getChildren().addAll(iv1, iv2, text, text2);

        Scene scene = new Scene(root, 1000, 700);
        primaryStage.setScene(scene);
        primaryStage.show();
       // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        /*Circle c = new Circle();
        c.setCenterX(100);
        c.setCenterY(50);
        c.setFill(Color.LAWNGREEN);
        Rectangle rect = new Rectangle();
        rect.setX(10);
        rect.setY(20);
        rect.setWidth(50);
        rect.setFill(Color.LAWNGREEN);*/

        /*CubicCurve cc = new CubicCurve();
        cc.setStartX(50);
        cc.setStartY(50);
        cc.setControlX1(300);
        cc.setControlX2(200);
        cc.setControlY1(100);
        cc.setControlY2(90);
        cc.setFill(Color.ROSYBROWN);
        cc.setEffect(new DropShadow());
        cc.setEndX(100);
        cc.setEndY(300);
*/
        /*root.getChildren().add(cc);*/

       /* VBox vbox = new VBox(c);
        Scene scene = new Scene(vbox, 300, 275);*/

    }


    public static void main(String[] args) {
        launch(args);
    }
}
