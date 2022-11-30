//Создать список типа ArrayList<String>.
//Поместить в него как строки, так и целые числа.
//Пройти по списку, найти и удалить целые числа.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task_3_3 {
    public static void main(String[] args) {

        List<String> sList = new ArrayList<String>();
        sList.add("10.5");
        sList.add("qq");
        sList.add("1");
        sList.add("ww");
        sList.add("rt");
        sList.add("qwerty");
        sList.add("01");
        sList.add("123");
        sList.add("777");

        System.out.printf("Первоначальный список: %s\n", sList);

// ошибка ConcurrentModificationException возникает именно тогда, когда мы пытаемся нарушить правило и изменить список во время итерации по нему.

// В Java для удаления элементов во время перебора нужно использовать специальный объект — итератор (класс Iterator).
// Класс Iterator отвечает за безопасный проход по списку элементов.
// Он достаточно прост, поскольку имеет всего 3 метода:
        // hasNext() — возвращает true или false в зависимости от того, есть ли в списке следующий элемент, или мы уже дошли до последнего.
        // next() — возвращает следующий элемент списка
        // remove() — удаляет элемент из списка

//создаем итератор
        Iterator<String> sListIterator = sList.iterator();
//        перебор всех строк списка итератором
        while (sListIterator.hasNext()) {
            boolean remove = true;
            String str = sListIterator.next();
//            посимвольный перебор каждой строки
            for (int i = 0; i < str.length(); i++) {
                char symbol = str.charAt(i);
//                если хотя бы один символ не цифра, то строку не удаляем. работает и на дробных числах
                if (!Character.isDigit(symbol)) {
                    remove = false;
                    break;
                }
            }
            if (remove) sListIterator.remove();
        }
        System.out.printf("Изменённый список: %s\n", sList);
    }
}

