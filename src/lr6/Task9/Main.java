package lr6.Task9;



import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[] arr = new char[]{'a', 'f', 'e', 'd', 'x', 'z', 'y'};
        System.out.println("Массив до метода: " + Arrays.toString(arr));
        System.out.println("Массив после метода: " + Arrays.toString(Task9.modarr(arr)));
    }
}
