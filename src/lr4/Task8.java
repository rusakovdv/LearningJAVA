package lr4;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования");
        String text = in.nextLine();
        System.out.println("Введите ключ");
        int key = in.nextInt();
        char[] ArrayChar = text.toCharArray();
        long[] ArrayInt = new long[ArrayChar.length];
        char[] ArrayCharNew = new char[ArrayChar.length];
        for (int i = 0; i< ArrayChar.length; i++)
        {
            ArrayInt[i] = ArrayChar[i] + key; // прибавляем к символу с индексом i сдвиг
            ArrayCharNew[i] = (char)ArrayInt[i]; // преобразовываем число в символ char и записываем на нужное место в новый массив
        }
        text = new String (ArrayCharNew);
        System.out.println("Текст после преобразования: \n" + text);
        System.out.println("Выполнить обратное преобразование? (y/n)");
        Scanner inn = new Scanner(System.in);
        int exit = 0;
        do {
            String decry = inn.nextLine();
        switch (decry) {
            case ("y"):
                char[] ArrayDeChar = text.toCharArray();
                for (int i = 0; i < ArrayDeChar.length; i++) {
                    ArrayInt[i] = ArrayDeChar[i] - key; // прибавляем к символу с индексом i сдвиг
                    ArrayCharNew[i] = (char) ArrayInt[i]; // преобразовываем число в символ char и записываем на нужное место в новый массив
                }
                text = new String(ArrayCharNew);
                System.out.println("Текст после преобразования: \n" + text);
                exit ++;
                break;
            case ("n"):
                System.out.println("До свидания!");
                exit ++;
                break;
            default:
                System.out.println("Введите корректный ответ");
                break;
        }
        }while (exit<1);

    }
}
