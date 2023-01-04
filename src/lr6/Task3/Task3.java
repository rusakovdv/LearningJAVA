package lr6.Task3;
import java.util.Arrays;
public class Task3 {

    public static void int1(int... ints){
      Arrays.sort(ints);
      int sum = 0;
      System.out.println("Min el: " + ints[0] + " " + "Max el: " + ints[ints.length - 1]);
      for(int i = 0; i < ints.length; i ++ ){
          sum += ints[i];
      }
      double average = ((double) sum) / ints.length;
        System.out.println("Average = " + average );
    }
    public static void arr1(int[] arr){
        Arrays.sort(arr);
        int sum = 0;
        System.out.println("Min el: " + arr[0] + " " + "Max el: " + arr[arr.length - 1]);
        for(int i = 0; i < arr.length; i ++ ){
            sum += arr[i];
        }
        double average = ((double) sum) / arr.length;
        System.out.println("Average = " + average );
    }
}
