package lr12;

import java.util.List;
import java.util.stream.Collectors;

public class Example7 {
    public static void main(String[] args) {
        String str = "Напишите функцию, зима которая принимает на вход список " +
                "строк и возвращает зима новый список, содержащий только те строки, " +
                "которые Начинаются с большой зима  Буквы";
        List<String> strings = List.of(str.split(" "));
        System.out.println("\n" + "Строка после разделения: " + "\n");
        for (String e : strings){
            System.out.println(e);
        }

        List<String> stringsAfter = filterCapitalizedStrings(strings);

        System.out.println("\n" + "Строки после преобразования: " + "\n");
        for (String e : stringsAfter) {
            System.out.println(e);
        }
    }
    public static List<String> filterCapitalizedStrings(List<String> list) {
        return list.stream()
                .filter(s -> s.length() > 3)
                .collect(Collectors.toList());
    }
}
