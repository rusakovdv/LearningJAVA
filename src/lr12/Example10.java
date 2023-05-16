package lr12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        System.out.println("\n" + "Список до: " + "\n");

        for(int i = 0; i < 10; i++){
            integers.add(random.nextInt(1000));
            System.out.println(integers.get(i));
        }
        System.out.println("Введите число");
        int int1 = in.nextInt();

        List<Integer> integersAfter = squareList(integers, int1);

        System.out.println("\n" + "Список чисел больше" + int1 + ": " + "\n");

        for (Integer i: integersAfter) {
            System.out.println(i);
        }
    }

    public static List<Integer> squareList(List<Integer> list, int int1) {
        return list.stream().filter(x -> x < int1).collect(Collectors.toList());
    }
}
