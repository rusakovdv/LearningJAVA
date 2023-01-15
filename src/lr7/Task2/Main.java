package lr7.Task2;



public class Main {
    public static void main(String[] args) {
     SuperClass superClassObject = new SuperClass("Передал в конструктор суперкласса");
     String className = superClassObject.toString();
     System.out.println(className);

     SubClass subClassObject = new SubClass("Передал в конструктор сабкласса", 5);
        String subClassName = subClassObject.toString();
        System.out.println(subClassName);
    }
}
