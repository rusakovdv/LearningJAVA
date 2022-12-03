package lr2;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        System.out.println("Введите любое целое число");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if ((x >= 5 ) & (x <= 10)){
            System.out.println("Данное число находится в диапазоне от 5 до 10");
        }else {
            System.out.println("Данное число не находится в диапазоне от 5 до 10");
        }
        in.close();
    }
}
