package lr7.Task4;

public class SubSubClass extends SubClass {
    public int int1;

    SubSubClass(char chEx, String strEx, int intEx){
        super(chEx, strEx);
        this.int1 = intEx;
    }
    SubSubClass(SubSubClass subSubClass){
        super(subSubClass.ch1, subSubClass.str1);
        this.int1 = subSubClass.int1;
    }

    public void setValue(char chEx, String strEx, int int1) {
        super.setValue(chEx, strEx);
        this.str1 = str1;
    }
    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str 1 = " + this.getch1() + "\n" +
                " ch 1 = " + this.getStr1() + "\n" +
                " str1 = " + this.int1;
        return ClassNameAndFieldValue ;
    }
}
