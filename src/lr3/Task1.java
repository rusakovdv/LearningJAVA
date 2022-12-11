package lr3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите целое число в диапазоне от 1 до 7");
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        switch (day) {
            case 1:
                System.out.println("Вы выбрали понедельник");
                break;
            case 2:
                System.out.println("Вы выбрали вторник");
                break;
            case 3:
                System.out.println("Вы выбрали среду");
                break;
            case 4:
                System.out.println("Вы выбрали четверг");
                break;
            case 5:
                System.out.println("Вы выбрали пятницу");
                break;
            case 6:
                System.out.println("Вы выбрали субботу");
                break;
            case 7:
                System.out.println("Вы выбрали воскресенье");
                break;
            default:
                System.out.println("Введено некорректное значение");

        }
        in.close();
    }
}
