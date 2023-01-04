package lr6.Task4;

public class Task4 {
    public static int factorial(int a) {
        int result = 1;
        for (int i = a; i > 0; i = i - 2) {
            result = result * i;
        }

        return result;
    }

    public static int recfactirial(int b) {
        int result = 1;
        if (b == 1 || b == 0) {
            return result;
        }
        result = b * recfactirial(b-2);
        return result;
    }
}
