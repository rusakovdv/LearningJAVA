package lr7.Task4;



public class Main {
    public static void main(String[] args) {
        SuperClass superClassObject = new SuperClass('q');
        String className = superClassObject.toString();
        SuperClass superClassObjectClone = new SuperClass(superClassObject);
        System.out.println(className);
        System.out.println("Проверка созданного клона: " + (superClassObject == superClassObjectClone));

        SubClass subClassObject = new SubClass('w', "qwe");
        String subClassName = subClassObject.toString();
        SubClass subClassObjectClone = new SubClass(subClassObject);
        System.out.println(subClassName);
        System.out.println("Проверка созданного клона: " + (superClassObject == subClassObjectClone));

        SubSubClass subSubClassObject = new SubSubClass('z', "asd", 7);
        String subSubClassName = subSubClassObject.toString();
        SubSubClass subSubClassObjectClone = new SubSubClass(subSubClassObject);
        System.out.println(subSubClassName);
        System.out.println("Проверка созданного клона: " + (subSubClassObject == subSubClassObjectClone));
    }
}
