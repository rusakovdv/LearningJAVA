package timus.task_1000;

import java.io.PrintWriter;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int A = in.nextInt();
        int B = in.nextInt();

        int result = A+B;

        out.println(result);
        out.flush();
    }
}
