package lr3;
import java.util.Arrays;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        int b = 0;
        System.out.println("Введите размер массива");
        String userInput = id.nextLine();
        int size=0;
        try {
            size = Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Введено не целое число");
        }
        size = Math.abs(size);
            int[] nums = new int[size];
            int i = 0;
            while (i < nums.length) {
                if (b % 5 != 2) b++;
                else {
                    nums[i] = b;
                    i++;
                    b++;
                }
            }
            System.out.println("Массив: " + Arrays.toString(nums));
        }
    }


