package lr6.Task1;

public class Task1 {
    private String str1;
    private char ch1;
     public void metod (String stri){
         this.str1 = stri;
     }
     public void metod (char chi){
         this.ch1 = chi;
     }
     public void metod (char[] arr){
         if(arr.length > 1){
             this.str1 =new String(arr);
         }else{
             this.ch1 =arr[0];
         }
     }
     public void view(){
         System.out.println("String: " + str1+ " " + "Char: " + ch1);
     }
}
