package lr10.Task1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Task1d {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse("src/lr10/Task1/example.xml");
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("book");
            System.out.println("Введите автора или год написания книги");
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String author =
                            element.getElementsByTagName("author").item(0).getTextContent();

                    String year =
                            element.getElementsByTagName("year").item(0).getTextContent();
                    if (author.equals(str) || year.equals(str) ) {
                        System.out.println("" +
                                element.getElementsByTagName("title").item(0).getTextContent());
                    }
                }
                }




        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
