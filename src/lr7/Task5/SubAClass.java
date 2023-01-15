package lr7.Task5;

public class SubAClass extends SuperClass {
    protected int int1;

    SubAClass(String strEx, int intEx){
        super(strEx);
        this.int1 = intEx;
    }

    public void getNameAndValue() {
        super.getNameAndValue();
        System.out.println("Int = " + this.getInt1());
    }

    public int getInt1() {
        return int1;
    }
}
