package lr3;
import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int n = 10;
        char[] aced = new char[n];
        char b = 'a';

        for (int i = 0; i < aced.length; i++) {
            aced[i] = b;
            b += 2;
            System.out.print(aced[i] + " ");
        }

        for (int i = aced.length - 1; i >= 0; i--) {
            System.out.print(aced[i] + " ");
        }
    }
}
