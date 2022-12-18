package lr4;

public class Task2 {
    public static void main(String[] args) {
        int figure = 9;
        int i ;
        int j ;
        int z, k;
        k = 1;
        for (i = 1 ; i <= figure; i++){
            System.out.print("номер строки: " + i + " ");
            z = 0;
            for (j = 0; j < figure; j++){
                if (j < k){
                    System.out.print("+");
                    z = z + 1;
                }
            }
            System.out.println(" Количество символов в строке " + z);
            k++;
        }
    }
}
