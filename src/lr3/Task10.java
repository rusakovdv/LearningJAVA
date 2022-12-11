package lr3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;
public class Task10 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = id.nextInt();
        Integer[] nums = new Integer[size];
        Random random = new Random();
        for (int i = 0 ; i < nums.length ; i++ ){
            nums[i] = random.nextInt(200);
        }
        System.out.println("Массив: " + Arrays.toString(nums));
        Arrays.sort(nums, Collections.reverseOrder());
        System.out.println("Массив: " + Arrays.toString(nums));
    }
}
