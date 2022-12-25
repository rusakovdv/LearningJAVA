package lr5.Task5;

public class Task5 {
    private int int1;

    public void setInt1(int inti) {
        if (inti > 100){
            this.int1 = 100;
            System.out.println(int1);
        }else{
            this.int1 = inti;
            System.out.println(int1);
        }

    }
    public void setInt1() {
        this.int1 = 0;
        System.out.println(int1);
    }

    public Task5(int inti) {
        if (inti > 100){
            this.int1 = 100;
            System.out.println(int1);
        }else{
            this.int1 = inti;
            System.out.println(int1);
        }
    }

    public Task5() {
        this.int1 = 0;
        System.out.println(int1);
    }

    public int getInt1() {
        return int1;
    }
}
