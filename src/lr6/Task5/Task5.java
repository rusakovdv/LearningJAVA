package lr6.Task5;

public class Task5 {
    public static int sumsquare (int a){
        int result = 0;
        for (int i = 1; i <= a; i++){
            result = result + i * i;
        }
        return result;
    }
    public static int recsumsquare(int b){
        int res = 0;
        if (b == 0) {
            return b;
        }
        res = res + b*b;
        return res + recsumsquare(b-1);
    }

}
