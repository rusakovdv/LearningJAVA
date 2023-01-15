package lr7.Task1;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        SuperClass superClassObject = new SuperClass("Передал в конструктор суперкласса");
        String className = superClassObject.toString();
        System.out.println(className);

        SubClass subClassObject = new SubClass("Передал в конструктор сабкласса");
        String subClassName = subClassObject.toString();
        System.out.println(subClassName);

        SubClass subClassObject2 = new SubClass("передал в конструктор подкласса","где два параметра");
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);

    }



}
