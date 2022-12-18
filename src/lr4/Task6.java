package lr4;
import java.util.Arrays;
import java.util.Random;
public class Task6 {
    public static void main(String[] args) {
        int height = 6;
        int width = 6;
        int i;
        int j;
        Random random = new Random();
        int[][] rectangle = new int[height][width];
        for (i = 0; i < rectangle.length; i++) {
            for (j = 0; j < rectangle[0].length; j++) {
                rectangle[i][j] = random.nextInt(9);

            }
        }
        System.out.println("Первый массив");
        for (i = 0; i < rectangle.length; i++) {
            for (j = 0; j < rectangle[0].length; j++) {
                System.out.print(rectangle[i][j] + " ");
            }
            System.out.println();
        }


            int row = random.nextInt(height);
        System.out.println("Удалена " + (row+1) + " строка");
            int column = random.nextInt(width);
        System.out.println("Удалена " + ((column + 1)) + " столбец");
            int[][] delete = new int[height - 1][width - 1];
            int p = 0;
            for (i = 0; i < rectangle.length; i++) {
                if (i == row){
                    continue;
                }
                int q = 0;
                for (j = 0; j < rectangle[0].length; j++) {
                    if (j == column) {
                        continue;
                    }
                    delete[p][q] = rectangle[i][j];
                    q ++;
                }
            p ++;
            }
            System.out.println("Второй массив");
            for (i = 0; i < delete.length; i++) {
                for (j = 0; j < delete[0].length; j++) {
                    System.out.print(delete[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

