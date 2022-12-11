package lr3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int first = in.nextInt();
        System.out.println("Введите второе число");
        int second = in.nextInt();
        int big, less = 0;
        if (first > second){
             big = first;
             less = second;
        }else{
             big = second;
             less = first;
        }
        System.out.println("Выберите версию программы:\n" +
                "1 - на основе цикла for\n" +
                "2 - на основе цикла while\n" +
                "3 - на основе цикла do While");
        int ver = in.nextInt();
        switch (ver){
            case 1:
                for(int i = less; i <= big;i++){
                    System.out.print(i + ", ");
                }
                break;
            case 2:
                int i = less;
                while (i<=big){
                    System.out.print(i + ", ");
                    i++;
                }
                break;
            case 3:
                int j = less;
                do{
                    System.out.print(j + ", ");
                    j++;
                }while (j<=big);
                break;
        }




    }
}
