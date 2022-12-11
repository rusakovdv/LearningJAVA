package lr3;
import java.util.Arrays;
public class Task8 {
    public static void main(String[] args) {
        int n = 10;
        char a = 'A';
        char[] arrey = new char[n];
        for (int i = 0; i < arrey.length; i++){
            if ((a == 'A') || (a == 'E') || (a == 'I') || (a == 'O') || (a == 'U') || (a == 'Y')){
                a++;
                i--;
            }else {
                arrey[i] = a;
                a++;
            }
        }
        System.out.println("Массив: " + Arrays.toString(arrey));
    }
}
