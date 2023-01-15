package lr7.Task5;

public class SubBClass extends SuperClass {
    protected char ch1;

    SubBClass(String strEx, char chEx){
        super(strEx);
        this.ch1 = chEx;
    }


    public void getNameAndValue() {
        super.getNameAndValue();
        System.out.println("Char = " + this.getCh1());
    }

    public char getCh1() {
        return ch1;
    }
}
