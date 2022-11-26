package lr1;
import java.util.Scanner;
public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int b = in.nextInt();
        int a = b - 1;
        int c = b + 1;
        int d = a + b + c;
        d = d * d;
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}
