//Заполнить список десятью случайными числами.
//Отсортировать список методом sort() и вывести его на экран.

import java.util.ArrayList;
import java.util.List;

public class Task_3_1 {
    public static void main(String[] args) {

        List<Byte> list = new ArrayList<Byte>();
        for (byte i = 0; i < 10; i++) {
            list.add((byte) (Math.random() * 100));
        }
        System.out.println(list);
        list.sort(null);
        System.out.println(list);


    }
}
