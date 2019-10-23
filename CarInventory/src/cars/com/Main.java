package cars.com;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbBuilder = dbfactory.newDocumentBuilder();
            Document doc = dbBuilder.newDocument();

            Element rootElement = doc.createElement("cars");
            doc.appendChild(rootElement);

            Element superCars = doc.createElement("supercars");
            rootElement.appendChild(superCars);

            Attr attr = doc.createAttribute("company");
            attr.setValue("BMW");

            superCars.setAttributeNode(attr);

            Element carname = doc.createElement("carname");
            Attr attrType = doc.createAttribute("type");
            attrType.setValue("sport");
            carname.setAttributeNode(attrType);
            carname.appendChild(doc.createTextNode("M-3"));
            superCars.appendChild(carname);

            TransformerFactory transformerFactory =TransformerFactory.newDefaultInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("C:\\Users/grego/Documents/xml/cars.xml"));
            transformer.transform(domSource, result);

            StreamResult consoleResult = new StreamResult(System.out);

            transformer.transform(domSource, consoleResult);


        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
