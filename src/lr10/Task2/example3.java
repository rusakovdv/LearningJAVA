package lr10.Task2;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;

import java.io.FileReader;
import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();

            Object obj = parser
                    .parse(new FileReader("src/lr10/Task2/example.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");
            System.out.println("Введите автора");
            Scanner in = new Scanner(System.in);
            String author = in.nextLine();
            for (Object o : jsonArray) {
                JSONObject book = (JSONObject) o;
                        if (author.equals(book.get("author"))) {
                        System.out.println("\nТекущий элемент: book");
                        System.out.println("Название книги: " + book.get("title"));
                        System.out.println("Автор: " + book.get("author"));
                        System.out.println("Год издания: " + book.get("year"));
            }
                    };

        } catch (Exception e){
        e.printStackTrace();}
    }
}
