package lr6.Task6;

public class Task6 {
    public static int[] modarr(int[] arr, int a){
        if (a >= arr.length){
            int[] newarr = new int[arr.length];
            System.arraycopy(arr, 0, newarr, 0, newarr.length);
            return newarr;
        }else{
            int[] newarr = new int[a];
            for (int i = 0; i < newarr.length; i++){
                newarr[i] = arr[i];
            }
            return newarr;
        }
    }
}
