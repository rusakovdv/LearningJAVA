package lr1;
import java.util.Scanner;
public class Example9 {
    public static void main(String[] args) {
        int day, mday;
        day = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите месяц: ");
        String month = in.nextLine();
        if (month.equals("январь") | month.equals("март") | month.equals("май") | month.equals("июль") | month.equals("август") | month.equals("октябрь") | month.equals("декабрь")) {
            day = 31;
            }
        if (month.equals("февраль")) {
            day = 28;
        }
        if (month.equals("апрель") | month.equals("июнь") | month.equals("сентябрь") | month.equals("ноябрь")) {
            day = 30;
        }
        System.out.println("Введите число дней: ");
        mday = in.nextInt();
        in.close();
        if (mday <= day) {
            System.out.println("Данный месяц сдержит указанное число дней");
        }else {
            System.out.println("В данном месяце меньше дней");
        }
        }
        }



