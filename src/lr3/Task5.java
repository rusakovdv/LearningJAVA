package lr3;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел в сумме");
        int sum = in.nextInt();
        int b = 1;
        int ans = 0;
        int i = 0;
        System.out.println("Выберите версию программы:\n" +
                "1 - на основе цикла for\n" +
                "2 - на основе цикла while\n" +
                "3 - на основе цикла do While");
        int ver = in.nextInt();
        switch (ver) {
            case 1:
                for (i = 0; i < sum; i++) {
                    for (int j = b; true; j++) {
                        if ((j % 5 == 2) || (j % 3 == 1)) {
                            System.out.print(j + " ");
                            ans = ans + j;
                            b++;
                            break;
                        }else {
                            b++;
                        }
                    }

                }
                System.out.println("Сумма чисел ровна : " + ans);
                break;
            case 2:
                i = 0;
                while (i < sum){
                    if ((b % 5 == 2) || (b % 3 == 1)) {
                        System.out.print(b + " ");
                        ans = ans + b;
                        i++;
                        b ++;
                    }else{
                        b++;
                    }

                }
                System.out.println("Сумма чисел ровна : " + ans);
                break;
            case 3:
                i = 0;
                do {
                    if ((b % 5 == 2) || (b % 3 == 1)) {
                        System.out.print(b + " ");
                        ans = ans + b;
                        i++;
                        b ++;
                    }else{
                        b++;
                    }
                }while (i < sum);
                System.out.println("Сумма чисел ровна : " + ans);
                break;
        }

    }
}
