package lr7.Task2;

public class SubClass extends SuperClass {

    public int int1;
    SubClass(String strEx, int intEx){
        super(strEx);
        this.int1 = intEx;
    }

    public void setValue(){}
    public void setValue(String strEx){
        super.setValue(strEx);
    }
    public void setValue(int intEx){
        this.int1 = intEx;
    }
    public void setValue(String strEx, int intEx){
        super.setValue(strEx);
        this.int1 = intEx;
    }
    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str 1 = " + this.getStr1() + "\n" +
                " int 1 = " + this.int1;
        return ClassNameAndFieldValue ;
    }

}
