package lr10.Task3;

import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Node;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        String filePath = "src/lr10/Task3/test.txt";
        try {
            Document doc = Jsoup.connect("http://fat.urfu.ru/inden.html").get();
            Elements newsParent = doc
                    .select("body > table > tbody > tr > td > div > table > " +
                            "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                            "tr > td:nth-child(1)");
            try (FileWriter file = new FileWriter(filePath);) {
            for (int i =3; i < 20; i++) {
                if (!(i % 2 == 0)) {
                    List<Node> nodes = newsParent.get(0).childNodes();

                    file.append("Тема: " +
                            ((Element) nodes.get(i))
                                    .getElementsByClass("blocktitle")
                                    .get(0).childNodes().get(0));
                    file.append("Дата : " +
                            ((Element) nodes.get(i))
                                    .getElementsByClass("blockdate")
                                    .get(0).childNodes().get(0) +
                            "\n");
                }
            }
            } catch (Exception e) {
                        e.printStackTrace();
                    }





        }catch (HttpStatusException e) {
            System.out.println("404 нет такой страницы");;
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
