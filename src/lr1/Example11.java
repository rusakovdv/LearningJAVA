package lr1;
import java.util.Scanner;
public class Example11 {
    public static void main(String[] args) {
        int pyear = 2022;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String name = in.nextLine();
        System.out.println("Введите год рождения");
        int year = in.nextInt();
        int age = pyear - year;
        System.out.println("Ваш возраст - " + age + " лет,  ваше имя - " + name );
    }
}
