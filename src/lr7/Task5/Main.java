package lr7.Task5;

public class Main {
    public static void main(String[] args) {
        SuperClass superClassObject = new SuperClass("Hi");
        superClassObject.getNameAndValue();

        SubAClass subAClass = new SubAClass("Hey", 5);
        subAClass.getNameAndValue();

        SubBClass subBClass = new SubBClass("Good", 'q');
        subBClass.getNameAndValue();
    }
}
