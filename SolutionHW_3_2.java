import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//2. Пусть дан произвольный список целых чисел, удалить из него четные числа
public class SolutionHW_3_2 {
    public static void main(String[] args) {

        List<Byte> listNumbers = new ArrayList<>();
        for (byte i = 0; i < 20; i++) {
            listNumbers.add((byte) (Math.random() * Byte.MAX_VALUE));
        }
        System.out.printf("Произвольный список %s\n", listNumbers);

        //создаем итератор
        Iterator<Byte> listNumIterator = listNumbers.iterator();
//        перебор всех элементов списка итератором
        while (listNumIterator.hasNext()) {
            byte element = listNumIterator.next();
//            если элемент чётный, то удаляем из списка
            if (element % 2 == 0) {
                listNumIterator.remove();
            }
        }
        System.out.printf("Список без чётных чисел %s\n", listNumbers);
    }
}

