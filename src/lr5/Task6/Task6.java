package lr5.Task6;

import java.util.Arrays;

public class Task6 {
    private int min;
    private int max;

    public void opredelenie(int int1, int int2) {
        int[] arr = new int[]{min, max, int1, int2};
        Arrays.sort(arr);
        this.min = arr[0];
        this.max = arr[3];

    }

    public void opredelenie(int int1) {
        int[] arr = new int[]{min, max, int1};
        Arrays.sort(arr);
        this.min = arr[0];
        this.max = arr[2];

    }

    public Task6(int int1, int int2) {
        int[] arr = new int[]{min, max, int1, int2};
        Arrays.sort(arr);
        this.min = arr[0];
        this.max = arr[3];
    }

    public Task6(int int1) {
        int[] arr = new int[]{min, max, int1};
        Arrays.sort(arr);
        this.min = arr[0];
        this.max = arr[2];
    }

    public void getMinMax() {
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }


}
