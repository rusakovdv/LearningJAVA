package lr11.Task6;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> Objects = new HashMap<>();
        Objects = Add(Objects);
        System.out.println(Objects);
        System.out.println("Строки в которых ключ больше 5: ");
        for (int i =6; i < Objects.size(); i ++) {
            System.out.println(Objects.get(i));
        }
        System.out.println("Строка с ключём 0:" + Objects.get(0));
        Sum(Objects);
    }

    public static HashMap Add(HashMap <Integer, String> Exp ) {
        String str = "Str";
        for (int i = 0; i <= 10; i++ ) {
            Exp.put(i, str );
            str = str + "Str";
        }
        return Exp;
    }
    public static void Sum (HashMap Exp1) {
        String lenght;
        int keySum = 1;
        for (int i = 0; i <= 10; i++ ) {
            lenght =(String) Exp1.get(i);
            if (lenght.length() > 5) {
                keySum = keySum * i;
            }
        }
        System.out.println("Произведение = " + keySum);
    }

}
