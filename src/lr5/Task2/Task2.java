package lr5.Task2;

public class Task2 {
    char a;
    char b;

    public void setAB(char a, char b) {
        this.a = a;
        this.b = b;
    }

    public void list(){
        int int1 = a;
        int int2 = b;
        if (a > b) {
            int1 = b;
            int2 = a;
        }

        for (int i = int1; i <= int2; i++) {
            System.out.print((char) i + " ");


        }
    }

}
