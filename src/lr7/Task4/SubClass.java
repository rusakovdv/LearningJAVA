package lr7.Task4;

public class SubClass extends SuperClass {
    public String str1;
    SubClass(char chEx, String strEx){
        super(chEx);
        this.str1 = strEx;
    }
    SubClass(SubClass subClass){
        super(subClass.ch1);
        this.str1 = subClass.str1;
    }
    public void setValue(char ch1, String str1) {
        super.setValue(ch1);
        this.str1 = str1;
    }

    public String getStr1() {
        return str1;
    }

    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str 1 = " + this.getch1() + "\n" +
                " ch 1 = " + this.str1 + "\n";
        return ClassNameAndFieldValue ;
    }
}
