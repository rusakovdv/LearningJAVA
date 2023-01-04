package lr6.Task10;

import java.util.Arrays;

public class Task10 {
    public static int[] met (int... a){
        Arrays.sort(a);
        int[] result = new int[2];
        result[0] = a[0];
        result[1] = a[a.length-1];
        return result;
    }

}
