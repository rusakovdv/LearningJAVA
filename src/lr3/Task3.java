package lr3;
import java.util.Scanner;
import java.util.Arrays;
public class Task3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите количество чисел в последовательности");
        int size = id.nextInt();
        int[] nums = new int[size];
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите версию программы:\n" +
                "1 - на основе цикла for\n" +
                "2 - на основе цикла while\n" +
                "3 - на основе цикла do While");
        int ver = in.nextInt();
        switch (ver){
            case 1:
                for (int i = 0 ; i < nums.length ; i++ ){
                    if (i<2){
                        nums[i] = 1;
                    }else{
                        nums[i] = nums[i-1] + nums[i-2];
                    }
                }
                break;
            case 2:
                int j = 0;
                while (j < nums.length){
                    if (j<2){
                        nums[j] = 1;
                    }else{
                        nums[j] = nums[j-1] + nums[j-2];
                    }
                    j++;
                }
                break;
            case 3:
                int z = 0;
                do {
                    if (z<2){
                        nums[z] = 1;
                    }else{
                        nums[z] = nums[z-1] + nums[z-2];
                    }
                    z ++;
                }while (z < nums.length);
                break;
        }
        System.out.println("Число фибоначи: " + Arrays.toString(nums));
        }
    }

