package lr10.Task2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader("src/lr10/Task2/example.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");
            Scanner in = new Scanner(System.in);
            System.out.println("Введите название книги, которую хотите удалить");
            String title = in.nextLine();
            Iterator iterator = jsonArray.iterator();
            while (iterator.hasNext()) {
                JSONObject book = (JSONObject) iterator.next();
                if (title.equals(book.get("title"))) {
                    iterator.remove();
                }}
            try (FileWriter file = new FileWriter("src/lr10/Task2/example.json");) {
                file.write(jsonObject.toJSONString());
                System.out.println("Книга удалена!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
