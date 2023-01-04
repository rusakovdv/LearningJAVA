package lr6.Task8;

public class Task8 {
    public static float modarr(int[] arr) {
        int sum = 0;
        for (int j : arr) sum += j;
        return (float) (sum / arr.length);
    }
}
