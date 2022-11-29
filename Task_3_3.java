//Создать список типа ArrayList<String>.
//Поместить в него как строки, так и целые числа.
//Пройти по списку, найти и удалить целые числа.

import java.util.ArrayList;
import java.util.List;

public class Task_3_3 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("10");
        list.add("qq");
//        for (sym:
//             ) {
//
//        }
//        if(list.get(0).i)

        char sym = 'q';
        if (Character.isDigit(sym)) System.out.printf("Символ %s цифра", sym);
        char num = '1';
        if (Character.isDigit(num)) System.out.printf("Символ %s цифра", num);


//преобразовать каждую строку списка в char и пройтись по нему на предмет проверки isdigit
//            если есть хотя бы одна не цифра, то оставить, иначе удалить
        
    }
}
