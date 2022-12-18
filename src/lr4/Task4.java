package lr4;
import java.util.Arrays;
public class Task4 {
    public static void main(String[] args) {
        int height = 9;
        int width = 1;
        int i ;
        int j ;

        int [][] rectangle = new int [height][];
        for (i = 0 ; i < rectangle.length; i++){
            rectangle[i] = new int [width];
            for (j = 0; j < width; j++){
                rectangle[i][j] = 2;
            }
            width ++;
        }
        for (i = 0 ; i < rectangle.length; i++){
            for (j = 0; j < rectangle[i].length; j++){
                System.out.print(rectangle[i][j]);
            }
            System.out.println();
        }
    }
}
