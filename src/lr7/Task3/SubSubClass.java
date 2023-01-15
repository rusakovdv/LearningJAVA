package lr7.Task3;

public class SubSubClass extends SubClass {
    public String str1;

    SubSubClass(int intEx, char chEx, String strEx){
        super(intEx, chEx);
        this.str1 = strEx;
    }

    public void setValue(int int1, char ch1, String str1) {
        super.setValue(int1, ch1);
        this.str1 = str1;
    }
    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str 1 = " + this.getInt1() + "\n" +
                " ch 1 = " + this.getCh1() + "\n" +
                " str1 = " + this.str1;
        return ClassNameAndFieldValue ;
    }
}
