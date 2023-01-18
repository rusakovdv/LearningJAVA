package timus.task_1209;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
       long n = in.nextLong();
       for(long i = 0; i < n; i++){
           long x = in.nextLong() - 1;
           long y = (long) Math.sqrt(8 * x + 1);
           if (y * y == (8 * x + 1)){
               System.out.println("1 ");
           }else{
               System.out.println("0 ");
           }
       }
    }
}
