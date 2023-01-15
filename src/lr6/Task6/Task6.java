package lr6.Task6;

public class Task6 {
    public static int[] modarr(int[] arr, int a){
        if (a >= arr.length){ //если переменная больше длинны массыва, то копирую массив
            int[] newarr = new int[arr.length]; //создаю новый массив
            System.arraycopy(arr, 0, newarr, 0, newarr.length);  // копирую массив
            return newarr;
        }else{
            int[] newarr = new int[a]; // создаю новый массив размером в переменную
            for (int i = 0; i < newarr.length; i++){
                newarr[i] = arr[i]; // заполняю его
            }
            return newarr;
        }
    }
}
