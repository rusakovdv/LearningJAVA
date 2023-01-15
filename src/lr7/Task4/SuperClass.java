package lr7.Task4;

public class SuperClass {
    public char ch1;
    SuperClass(char chEx) {
        this.ch1 = chEx;
    }
    public void setValue(char ch1){
        this.ch1 = ch1;
    }

    public char getch1() {
        return ch1;
    }

    SuperClass(SuperClass superclass){
        this.ch1 = superclass.ch1;
    }
    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = " Class name: " + this.getClass().getSimpleName() + "\n" +
                " ch 1 = " + this.getch1() + "\n";
        return ClassNameAndFieldValue ;
    }
}
