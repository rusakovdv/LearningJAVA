package lr10.Task1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

public class Task1c {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse("src/lr10/Task1/example.xml");
            Scanner in = new Scanner(System.in);

            Node root = doc.getDocumentElement();
            Element book = doc.createElement("book");
            root.appendChild(book);

            System.out.println("Введите название книги");
            String str = in.nextLine();
            Element title = doc.createElement("title");
            title.setTextContent(str);
            book.appendChild(title);

            Element author = doc.createElement("author");
            System.out.println("Введите автора");
            str = in.nextLine();
            author.setTextContent(str);
            book.appendChild(author);

            Element year = doc.createElement("year");
            System.out.println("Введите год написания книги");
            str = in.nextLine();
            year.setTextContent(str);
            book.appendChild(year);


            Transformer transformer =
                    TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/lr10/Task1/example.xml"));
            transformer.transform(source, result);
        } catch (Exception e){
            e.printStackTrace();
        }


    }
}
