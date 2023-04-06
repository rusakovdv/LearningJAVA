package lr11.Task2;

public class Task1 {
    public static String toBinaryString(int num) {
        return num > 0 ? toBinaryString(num / 2) + String.valueOf(num % 2) : "";
    }

    public static void main(String[] args) {
        System.out.println(toBinaryString(19));
    }
}
