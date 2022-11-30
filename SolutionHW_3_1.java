//1.Реализовать алгоритм сортировки слиянием

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionHW_3_1 {

    public static byte[] mergeSort(byte[] arrayA, byte[] arrayB) {
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

    public static List<byte[]> splitArray(byte[] array){
        List<byte[]> listArrays = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {

        }
//        брать попарно элементы массива, сортировать их и добавлять в List
//        в итоге будет список отсортированных массивов, длина каждого 2, последнего может быть 1
        return listArrays;
    }

    public static void main(String[] args) {

//        byte[] arrayA = new byte[5];
        byte[] arrayA = {2, 4, 6, 8, 10};
//        byte[] arrayB = new byte[7];
        byte[] arrayB = {3, 5, 7};

//        for (byte i = 0; i < arrayB.length; i++) {
//            arrayB[i] = (byte) (Math.random() * Byte.MAX_VALUE);
//            if (i < arrayA.length) arrayA[i] = (byte) (Math.random() * Byte.MAX_VALUE);
//        }


        System.out.println(Arrays.toString(arrayA));
        System.out.println(Arrays.toString(arrayB));

        List<byte[]> listArrays = new ArrayList<>();
        listArrays.add(arrayA);
        listArrays.add(arrayB);


        byte[] arrayC = mergeSort(listArrays.get(0), listArrays.get(1));
        System.out.println(Arrays.toString(arrayC));


    }
}
