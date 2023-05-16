package lr12;

import java.util.List;
import java.util.stream.Collectors;

public class Example9 {
    public static void main(String[] args) {
        String str = "Напишите ф56ункцию, зима кото56рая приним56ает на вход список " +
                "строк и возвращ56ает зима но56вый список, соде56ржащий только те строки, " +
                "которые Начинаются с бол56ьшой зима  Бу56квы";
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
                .filter(str -> str.chars().allMatch(Character::isLetter))
                .collect(Collectors.toList());

    }
}
