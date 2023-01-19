package lr8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Example3 {
    public static void readAllBuArray(InputStream in) throws IOException {
        byte [] buff = new byte[5];
        while (true){
            int count = in.read(buff);
            if (count != -1) {
                System.out.println("количество = " + count + "\n"
                        + "buff = " + Arrays.toString(buff) + "\n"
                        + "str = " + new String(buff, 0, count, "cp1251"));
            }else{
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String fileName = "D:\\test.txt";
        InputStream inFile = null;

        try{
            inFile = new FileInputStream(fileName);
            readAllBuArray(inFile);
        }catch (IOException e){
            System.out.println("Ошибка открытия-закрытия файла " + fileName + e);
        }finally {
            if (inFile != null){
                try{
                    inFile.close();
                }catch (IOException ignore){
                    /*NOP*/
                }
            }
        }
    }
}
