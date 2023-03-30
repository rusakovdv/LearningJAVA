package lr10.Task1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

public class Task1e {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            dbFactory.setNamespaceAware(true);
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse("src/lr10/Task1/example.xml");
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("book");
            System.out.println("Введите название книги которую хотите удалить");
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String title =
                            element.getElementsByTagName("title").item(0).getTextContent();

                    if (title.equalsIgnoreCase(str) ) {
                        Node delNode = element.getParentNode();
                        delNode.removeChild(element);
                        System.out.println(element);
                    }
                }
                Transformer transformer =
                        TransformerFactory.newInstance().newTransformer();
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                DOMSource source = new DOMSource(doc);
                StreamResult result = new StreamResult(new File("src/lr10/Task1/example.xml"));
                transformer.transform(source, result);
            }




        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
