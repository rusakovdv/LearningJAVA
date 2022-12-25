package lr5.Task6;

public class Main {
    public static void main(String[] args) {
        System.out.println("Конструктор с 1 агрументом");
        Task6 frstcons = new Task6(5);
        frstcons.getMinMax();
        System.out.println("Конструктор с 2 агрументами");
        Task6 scndcons = new Task6(5, 10);
        scndcons.getMinMax();
        System.out.println("Метод с 1 агрументом");
        frstcons.opredelenie(15);
        frstcons.getMinMax();
        System.out.println("Метод с 2 агрументами");
        frstcons.opredelenie(25, -1);
        frstcons.getMinMax();
    }
}
