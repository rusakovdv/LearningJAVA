package lr7.Task5;

public class SuperClass {
    private String str1;

    SuperClass(String strEx){
        this.str1 = strEx;
    }

    public void getNameAndValue (){
        System.out.println(" Class name: " + this.getClass().getSimpleName() + "\n"
         + "String = " + this.getStr1());
    }

    public String getStr1() {
        return str1;
    }
}
