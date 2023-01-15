package lr7.Task3;

public class SubClass extends SuperClass {
    public char ch1;
    SubClass(int intEx, char chEx){
        super(intEx);
        this.ch1 = chEx;
    }

    public void setValue(int int1, char ch1) {
        super.setValue(int1);
        this.ch1 = ch1;
    }

    public char getCh1() {
        return ch1;
    }

    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str 1 = " + this.getInt1() + "\n" +
                " ch 1 = " + this.ch1 + "\n";
        return ClassNameAndFieldValue ;
    }
}
