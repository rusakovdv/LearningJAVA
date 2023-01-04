package lr6.Task1;

public class Main {
    public static void main(String[] args) {
        char[] arr = new char[]{'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        Task1 task1 = new Task1();
        task1.metod('a');
        task1.view();
        task1.metod(arr);
        task1.view();
        task1.metod("asdasd");
        task1.view();
        char[] arr1 = new char[]{'h'};
        task1.metod(arr1);
        task1.view();

    }
}
