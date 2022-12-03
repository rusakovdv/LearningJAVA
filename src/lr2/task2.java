package lr2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        System.out.println("Введите любое целое число");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if ((x % 5 == 2) & (x % 7 == 1)){
            System.out.println("Данное число удолетворяет всем критериям");
        }else {
            System.out.println("Даннок число не удолетворяет всем требованиям");
        }
        in.close();
    }
}
