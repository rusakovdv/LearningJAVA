package lr1;
import java.util.Scanner;
public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pyear = 2022;
        System.out.println("Введите ваш возраст");
        int year = in.nextInt();
        int age = pyear - year;
        System.out.println("Вы родились в " + age + " году");
        in.close();
    }
}
