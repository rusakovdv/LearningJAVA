package lr5.Task4;
import java.math.BigDecimal;

public class Task4 {
     char ch1;
    int int1;

    public Task4(char ch1, int int1) {
        this.ch1 = ch1;
        this.int1 = int1;
        System.out.println("Первый конструктор:" + ch1 + " " + int1);
    }

    public Task4(double a) {

        this.ch1 = (char)a;
        if (BigDecimal.valueOf(a).scale() == 1){
            this.int1 = (int) ((a - (int) a) * 10);
        }else{
            this.int1 = (int) ((a - (int) a) * 100);
        }

        System.out.println(ch1 + " " + int1);
    }
}
