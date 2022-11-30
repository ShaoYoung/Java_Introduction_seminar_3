//1.Реализовать алгоритм сортировки слиянием

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SolutionHW_3_1 {

//    сортировка слиянием двух массивов
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

    public static List<byte[]> mergeSort(List<byte[]>listArrays){
        List<byte[]> listArr = new ArrayList<>();
        if (listArrays.size()==2){
            listArr.add(mergeSortTwoArrays(listArrays.get(0), listArrays.get(1)));
            return listArr;
        } else {
            int mid = listArrays.size() / 2;

//            ПОДУМАТЬ, КАК ОПТИМАЛЬНО СОЕДИНИТЬ МАССИВЫ

        }
        return listArr;
    }


//    разбивает массив на список массивов длиной 2, один массив может оказаться длиной 1
    public static List<byte[]> splitArray(byte[] array) {
        List<byte[]> listArrays = new ArrayList<>();
        if (array.length == 1) {
            listArrays.add(array);
            return listArrays;
        } else if (array.length == 2) {
//            сортировка
            if (array[0]>array[1]){
                byte temp = array[0];
                array[0] = array[1];
                array[1] = temp;
            }
            listArrays.add(array);
            return listArrays;
        } else {
            int mid = array.length / 2;
            byte[] arrLeft = new byte[mid];
            System.arraycopy(array, 0, arrLeft, 0, mid);
            byte[] arrRight = new byte[array.length - mid];
            System.arraycopy(array, mid, arrRight, 0, array.length - mid);
            listArrays.addAll(splitArray(arrLeft));
            listArrays.addAll(splitArray(arrRight));
            return listArrays;
        }
    }

    public static void main(String[] args) {

//        byte[] arrayA = new byte[5];
        byte[] arrayA = {18, 4, 8, 6, 13, 12, 14, 16, 18};
//        byte[] arrayB = new byte[7];
        byte[] arrayB = {3, 5, 7};

//        for (byte i = 0; i < arrayB.length; i++) {
//            arrayB[i] = (byte) (Math.random() * Byte.MAX_VALUE);
//            if (i < arrayA.length) arrayA[i] = (byte) (Math.random() * Byte.MAX_VALUE);
//        }


//        System.out.println(Arrays.toString(arrayA));
//        System.out.println(Arrays.toString(arrayB));
//
//        List<byte[]> listArrays = new ArrayList<>();
//        listArrays.add(arrayA);
//        listArrays.add(arrayB);
//
//
//        byte[] arrayC = mergeSort(listArrays.get(0), listArrays.get(1));
//        System.out.println(Arrays.toString(arrayC));
        List<byte[]> listArrays;
        listArrays = splitArray(arrayB);
        for (byte[] arr:listArrays) {
            System.out.println(Arrays.toString(arr));
        }
        listArrays = mergeSort(listArrays);
        for (byte[] arr:listArrays) {
            System.out.println(Arrays.toString(arr));
        }


    }
}
