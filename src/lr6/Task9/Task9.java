package lr6.Task9;

public class Task9 {
    public static char[] modarr(char[] arr) {
        char[] newarr = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[arr.length -1 - i];
        }
        return newarr;
    }
}
