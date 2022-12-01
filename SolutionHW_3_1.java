//1.Реализовать алгоритм сортировки слиянием

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionHW_3_1 {

    //    сортировка слиянием двух сортированных массивов
    public static byte[] mergeSortTwoArrays(byte[] arrayA, byte[] arrayB) {
        byte[] arrayC = new byte[arrayA.length + arrayB.length];
        byte a = 0, b = 0;
        for (byte i = 0; i < arrayC.length; i++) {
            if (a >= arrayA.length) {
                arrayC[i] = arrayB[b];
                b++;
            } else if (b >= arrayB.length) {
                arrayC[i] = arrayA[a];
                a++;
            } else if (arrayA[a] < arrayB[b]) {
                arrayC[i] = arrayA[a];
                a++;
            } else {
                arrayC[i] = arrayB[b];
                b++;
            }
        }
        return arrayC;
    }


    public static byte[] mergeSort(List<byte[]> listArrays) {
        if (listArrays.size() < 2) return listArrays.get(0);
        byte[] arr = listArrays.get(0);
// проход и сортировка (со слиянием) по всему списку отсортированных массивов
        for (int i = 1; i < listArrays.size(); i++) {
            arr = mergeSortTwoArrays(arr, listArrays.get(i));
        }
        return arr;
    }


    //  рекурсивно разбивает массив на список массивов длиной 2 и 1. каждый массив длиной 2 перед записью сортируется.
    public static List<byte[]> splitArray(byte[] array) {
        // т.к. количество массивов длиной 1 и 2 неизвестно, используем список
        List<byte[]> listArrays = new ArrayList<>();
        // добавление массива из одного элемента в список. выход из рекурсии 1.
        if (array.length == 1) {
            listArrays.add(array);
            return listArrays;
        } else if (array.length == 2) {
//            сортировка массива из двух элементов. выход из рекурсии 2
            if (array[0] > array[1]) {
                byte temp = array[0];
                array[0] = array[1];
                array[1] = temp;
            }
            // добавляем сортированный массив в список.
            listArrays.add(array);
            return listArrays;
        } else {
            // делим массив на 2 части
            int mid = array.length / 2;
            byte[] arrLeft = new byte[mid];
            System.arraycopy(array, 0, arrLeft, 0, mid);
            byte[] arrRight = new byte[array.length - mid];
            System.arraycopy(array, mid, arrRight, 0, array.length - mid);
            // рекурсия. в список добавляется левая и правая части массива
            listArrays.addAll(splitArray(arrLeft));
            listArrays.addAll(splitArray(arrRight));
            return listArrays;
        }
    }

    public static void main(String[] args) {
// генерация массива случайных чисел (byte)
        byte[] randomArray = new byte[20];
        for (byte i = 0; i < randomArray.length; i++) {
            randomArray[i] = (byte) (Math.random() * Byte.MAX_VALUE);
        }
        System.out.printf("Исходный массив %s\n", Arrays.toString(randomArray));
// разбиваем исходный массив на массивы длиной 2 и 1
        List<byte[]> listArrays = splitArray(randomArray);
        System.out.print("Массивы после разделения:");
        for (byte[] arr : listArrays) {
            System.out.printf(" %s ", Arrays.toString(arr));
        }
        System.out.println();

        System.out.printf("Сортированный массив %s\n", Arrays.toString(mergeSort(listArrays)));
    }
}