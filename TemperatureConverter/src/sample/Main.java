package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.text.DecimalFormat;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
       // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        VBox vbox = new VBox();
        VBox vbox2 = new VBox();

        Button btn = new Button("Convert");
        Button returnBtn = new Button("return");

        TextField resultInput = new TextField();



        Label resultOutput = new Label();

        ToggleGroup radioButtons = new ToggleGroup();

        ComboBox  choiceBox = new ComboBox();


        choiceBox.setValue("fahrenheit");
        choiceBox.setValue("celsius");
        choiceBox.getItems().addAll("fahrenheit", "celsius" );
        String celsius = "celsius";
         choiceBox.getValue();
        /*String choice = (String) choiceBox.getValue();
        System.out.println(choice);*/

        /*RadioButton celsius = new RadioButton("Celsius");
        celsius.setSelected(true);
        celsius.setToggleGroup(radioButtons);

        RadioButton fahrenheit = new RadioButton("Fahrenheit");
        fahrenheit.setToggleGroup(radioButtons); celsius.isSelected()*/

        btn.setOnAction(event -> {
            String getValue = resultInput.getText();
            double toNum = Double.parseDouble(getValue);
            /*while(getValue == ""){


                if(){

                }
            }*/

//            double toNum = Double.parseDouble(resultInput.getText());
            if(choiceBox.getValue().equals("celsius")){
                double celsiusResult = (toNum-32)*5/9;
                resultOutput.setText("Result:  " +  new DecimalFormat("##.##").format(celsiusResult)+ " C");
            }
            else {
                double fahrenheitResult = toNum*1.8+32;
                resultOutput.setText("Result:  " +  new DecimalFormat("##.##").format(fahrenheitResult)+ " F");
            }


            vbox2.getChildren().addAll(resultOutput);
            primaryStage.setScene(new Scene(vbox2, 300, 250));



        });

        vbox.getChildren().addAll(choiceBox, resultInput,  btn);


        primaryStage.setScene(new Scene(vbox, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
