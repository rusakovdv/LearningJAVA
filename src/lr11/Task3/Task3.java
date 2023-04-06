package lr11.Task3;

import java.util.Scanner;

public class Task3 {

    public static int[] arr;
    static Scanner in = new Scanner(System.in);
    public static int x = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int sizeArr = in.nextInt();
        arr = new int[sizeArr];
        enter(sizeArr);
        x=0;
        exit(arr);
    }
    public static int[] enter(int exp) {
        if (x == exp) return arr;
        else {
            System.out.print("Введите " + (x + 1) + " элемент массива: ");
            arr[x++] = in.nextInt();
        }
        return enter(exp);
    }

    public static void exit(int [] array){
        if (array == null || array.length == 0) {
            return;
        } else {
            if (x != array.length) {
                System.out.println(array[x]);
                x ++;
                exit(array);
            }


        }
    }
}
