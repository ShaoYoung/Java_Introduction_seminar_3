import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class SolutionHW_3_3 {
    public static void main(String[] args) {

        List<Byte> listNumbers = new ArrayList<>();
        for (byte i = 0; i < 20; i++) {
            listNumbers.add((byte) (Math.random() * Byte.MAX_VALUE));
        }
        System.out.printf("Произвольный целочисленный список %s\n", listNumbers);

        System.out.printf("Минимальное значение из списка %d\n", Collections.min(listNumbers));
        System.out.printf("Максимальное значение из списка %d\n", Collections.max(listNumbers));
        double sum = 0;
        for (byte element: listNumbers) {
            sum+=element;
        }
        System.out.printf("Среднее значение элементов списка %.2f\n", sum/listNumbers.size());

    }
}
