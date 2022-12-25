package lr5.Task3;

public class Task3 {
    int a;
    int b;

    public Task3(int a) {
        this.a = a;
        System.out.println(a);
    }
    public Task3(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println(a + " " + b);
    }

    public Task3(){
        System.out.println("Без агрументов");
    }

}
