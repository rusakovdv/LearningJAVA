package lr8;

import java.io.*;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя файла => ");
        String fname = sc.nextLine();
        try{
// Создается файл
            File f1=new File(fname);
            f1.createNewFile(); // файл создан
            System.out.println("Полный путь файла: "+ f1.getAbsolutePath());
            System.out.print("Введите количество строк для записи в файл => ");
            int n=sc.nextInt();
            DataOutputStream dOut = new DataOutputStream( new FileOutputStream(f1));
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                System.out.print("Введите строку для записи в файл => ");
                String s=sc.nextLine();
                dOut.writeUTF(s );
            }
            dOut.flush(); // дописываем несохраненные данные на диск
            dOut.close(); // закрываем поток
            DataInputStream dIn=new DataInputStream(new FileInputStream(f1));
            while (true) {
                System.out.println(dIn.readUTF());
            }
        }catch (Exception e) {
            System.out.println(""+e);
        }
        }
}
