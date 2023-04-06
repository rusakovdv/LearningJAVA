package lr11.Task7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 15; i++) {
            list.add(i + 1);
        }
        int count = 0;
        Iterator<Integer> it = list.iterator();
        while (list.size() > 1) {
            if (it.hasNext()) {
                it.next();
                count++;
                if (count == 2) {
                    it.remove();
                    count = 0;
                    System.out.println(list);
                }
            } else {
                it = list.iterator();
            }
        }
    }

}
