package lr4;
import java.util.Arrays;
import java.util.Random;
public class Task5 {
    public static void main(String[] args) {
        int height = 5;
        int width = 3;
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
        int[][] rect = new int[width][height];
        for (i = 0; i < rect.length; i++) {
            for (j = 0; j < rect[0].length; j++) {
                rect[i][j] = rectangle[j][i];

            }
        }
        System.out.println("Второй массив");
        for (i = 0; i < rect.length; i++) {
            for (j = 0; j < rect[0].length; j++) {
                System.out.print(rect[i][j] + " ");
            }
            System.out.println();
        }
    }
}
