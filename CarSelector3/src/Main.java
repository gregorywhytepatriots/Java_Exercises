import org.w3c.dom.*;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            /*

<cars>
    <supercars contry="Canada">
        <car type="sport">
            <make>BMW</make>
            <model>M-3</model>
            <year>2013</year>
        </car>
    </supercars>
</cars>

*/
            File carsFile = new File("C:/Users/grego/Documents/xml/cars.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(carsFile);

           // NodeList nodeList = doc.getElementsByTagName("supercars");

            NodeList nList = doc.getElementsByTagName("car");

            for (int i = 0; i < nList.getLength(); i++) {

                Node nNode = nList.item(i);

                System.out.println("\nCurrent Element: " + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element elem = (Element) nNode;
                    System.out.println("The elem name is " + elem.getNodeName());
                    if(elem.getNodeName().equals("car")){
                        Element make =doc.createElement("make");
                        make.appendChild(doc.createTextNode("BMW"));
                        elem.appendChild(make);

                        Element model =doc.createElement("model");
                        model.appendChild(doc.createTextNode("M-3"));
                        elem.appendChild(model);

                        Element year =doc.createElement("year");
                        year.appendChild(doc.createTextNode("2019"));
                        elem.appendChild(year);
                    }
                }
            }




            DOMSource source = new DOMSource(doc);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            StreamResult result = new StreamResult("C:/Users/grego/Documents/xml/cars.xml");
            transformer.transform(source, result);


   /*       System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
            System.out.println("Print Supercars element: " + attr.getNodeName());
            System.out.println("SuperCars content: " + attr.getTextContent());
            System.out.println("Print Carname element: " + attr.getChildNodes().item(1).getNodeName());
            System.out.println("Print Carname  attribute anotherway: " + carAttribute);

            System.out.println("SuperCars attribute: " + attr.getAttributeNode("company").getNodeValue());*/


            System.out.println("");

        }

        catch(Exception e) {
            System.out.println(e);
        }
    }




    }

