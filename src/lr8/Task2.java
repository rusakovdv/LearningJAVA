package lr8;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try{
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("F:\\text1.txt")));
            bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("F:\\text2.txt")));
            String s;

            int lineCount = 0;
            List<String> arrayList;
            while ((s = br.readLine()) != null){
                int wordCount = 0;
                lineCount ++;
                arrayList = Arrays.asList(s.split("[ ,:;-]"));
                for (String str: arrayList){
                    boolean test = str.matches("^(?ui:[аеёиоуыэюя]).*");
                        if (test == false){

                            bw.write(str + ": в строке номер - "+ lineCount + "\n");
                            wordCount ++;
                        }

                }
                bw.write("В " + lineCount + " строке: " + wordCount + " cлов на согласную \n" );
            }
            bw.flush();
            bw.close();
            br.close();
        } catch (IOException e){
            System.out.println("Ошибка !!!!!!!!");
        }
    }

}
