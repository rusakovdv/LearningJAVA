package lr4;
import java.util.Arrays;
public class Task3 {
    public static void main(String[] args) {
        int height = 9;
        int width = 15;
        int i ;
        int j ;

int [][] rectangle = new int [height][width];
        for (i = 0 ; i < rectangle.length; i++){
            for (j = 0; j < rectangle[0].length; j++){
                    rectangle[i][j] = 2;
            }
        }
        for (i = 0 ; i < rectangle.length; i++){
            for (j = 0; j < rectangle[0].length; j++){
                System.out.print(rectangle[i][j]);
            }
            System.out.println();
        }
    }
}
