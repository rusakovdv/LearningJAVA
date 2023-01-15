package lr7.Task3;



public class Main {
    public static void main(String[] args) {
        SuperClass superClassObject = new SuperClass(6);
        String className = superClassObject.toString();
        System.out.println(className);

        SubClass subClassObject = new SubClass(7, 'a');
        String subClassName = subClassObject.toString();
        System.out.println(subClassName);

        SubSubClass subSubClassObject = new SubSubClass(8, 'b', "asd");
        String subSubClassName = subSubClassObject.toString();
        System.out.println(subSubClassName);
    }
}
