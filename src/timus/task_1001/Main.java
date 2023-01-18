package timus.task_1001;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Deque<Long> deque = new LinkedList<>();
        while (in.hasNextLong())
            deque.addFirst(in.nextLong());

        for (Long l : deque)
            System.out.printf("%.4f\n", Math.sqrt(l));
    }
}
