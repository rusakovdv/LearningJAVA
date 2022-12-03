package lr2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Введите любое целое число");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x % 3 == 0) {
            System.out.println("Данное число делится на 3 без отстатка");
        } else {
            System.out.println("Данное число не  делится на 3 без отстатка");
        }
        in.close();
    }
}
