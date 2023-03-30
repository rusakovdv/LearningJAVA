package lr10.Task2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader("src/lr10/Task2/example.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");
            JSONObject newBook = new JSONObject();
            Scanner in = new Scanner(System.in);
            System.out.println("Введите название книги");
            String title = in.nextLine();
            newBook.put("title", title);
            System.out.println("Введите автора");
            String author = in.nextLine();
            newBook.put("author", author);
            System.out.println("Введите год написания");
            Scanner inn = new Scanner(System.in);
            Integer year = inn.nextInt();
            newBook.put("year", year);
            jsonArray.add(newBook);

            try (FileWriter file = new FileWriter("src/lr10/Task2/example.json");) {
                file.write(jsonObject.toJSONString());
                System.out.println("Json файл успешно создан!");
            }



        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
