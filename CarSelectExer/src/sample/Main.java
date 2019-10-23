package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.time.LocalDate;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        VBox  vbox = new VBox();
        primaryStage.setTitle("Car Selector");
        VBox vbox2 = new VBox();
        Scene scene1, scene2;

        Label label1 = new Label("Year: ");
        DatePicker datePicker = new DatePicker();
        datePicker.setMaxSize(140, 20);

        Label label2 = new Label("Make:");
        TextField textField2 = new TextField();
        textField2.setMaxSize(140, 20);

        Label label3 = new Label("Model:");
        TextField textField3 = new TextField();
        textField3.setMaxSize(140, 20);

        Button btnSubmit = new Button("Submit");
        btnSubmit.setMaxSize(60,20);
        Text text = new Text();
        text.setText("Submitted Successfully");
        Text text2 = new Text("It works");

        File carsFile = new File("C:/Users/grego/Documents/xml/cars.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(carsFile);



        btnSubmit.setOnAction(submit -> {
            LocalDate value = datePicker.getValue();
            String getDate = value.toString();
            String getMake = textField2.getText();
            String getModel = textField3.getText();
            System.out.println(getMake + getModel + getDate);

          //  ------------------------------ Add element to file--------------------------
                    try {


                        NodeList nList = doc.getElementsByTagName("car");

                        for (int i = 0; i < nList.getLength(); i++) {

                            Node nNode = nList.item(i);

                            System.out.println("\nCurrent Element: " + nNode.getNodeName());

                            if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                                Element elem = (Element) nNode;
                                System.out.println("The elem name is " + elem.getNodeName());
                                if(elem.getNodeName().equals("car")){
                                    Element make =doc.createElement("make");
                                    make.appendChild(doc.createTextNode(getMake));
                                    elem.appendChild(make);

                                    Element model =doc.createElement("model");
                                    model.appendChild(doc.createTextNode(getModel));
                                    elem.appendChild(model);

                                    Element year =doc.createElement("year");
                                    year.appendChild(doc.createTextNode(getDate));
                                    elem.appendChild(year);
                                }
                            }
                        }

                        DOMSource source = new DOMSource(doc);

                        TransformerFactory transformerFactory = TransformerFactory.newInstance();
                        Transformer transformer = transformerFactory.newTransformer();
                        StreamResult result = new StreamResult("C:/Users/grego/Documents/xml/cars.xml");
                        transformer.transform(source, result);

                        System.out.println("");

                    }

                    catch(Exception e) {
                        System.out.println(e);
                    }

            //------------------------------------- End of add element to file---------------------------


            vbox.getChildren().addAll(text);



        });


        vbox.getChildren().addAll(label1, datePicker, label2, textField2, label3, textField3, btnSubmit );
        scene1 = new Scene(vbox, 300, 275);
        primaryStage.setScene(scene1);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
