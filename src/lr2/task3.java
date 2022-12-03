package lr2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.println("Введите любое целое число");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if ((x % 4 == 0) & (x > 10)){
            System.out.println("Данное число делится на 4 и больше 10");
        }else {
            System.out.println("Даннок число не удолетворяет всем требованиям");
        }
        in.close();
    }
}
