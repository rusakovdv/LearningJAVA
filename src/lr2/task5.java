package lr2;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        System.out.println("Введите любое целое число");
        Scanner in = new Scanner(System.in);
        int y;
        float x = in.nextFloat();
        x = x / 1000;
        if (x < 1){
            System.out.println("В данном числе 0 тысяч");
        }else
        {
            y = (int)x;
            System.out.println("В данном числе " + y +  " тысяч");
        }


    }
}
