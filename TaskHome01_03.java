import java.util.Arrays;
import java.util.Random;

// 1.Реализовать алгоритм сортировки слиянием

public class TaskHome01_03 {
    public static void main(String[] args) {
        int[] arr = createArray(12, 100);
        System.out.printf("Изначальный массив: %s\n", Arrays.toString(arr));
        mergeArray(arr);
        System.out.printf("Сортированный массив: %s\n", Arrays.toString(arr));
    }

    static int[] createArray(int size, int upp) {
        Random rnd = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rnd.nextInt(upp);
        }
        return array;
    }
    static void mergeArray(int[] arr) {
        if (arr.length < 2)
            return;
        int middle = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, middle);
        int[] right = Arrays.copyOfRange(arr, middle, arr.length);
        mergeArray(left);
        mergeArray(right);
        sortArray(arr, left, right);
    }

    static void sortArray(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                k++;
                i++;
            } else {
                array[k] = right[j];
                k++;
                j++;
            }
        }
        while (i < left.length) {
            array[k] = left[i];
            k++;
            i++;
        }
        while (j < right.length) {
            array[k] = right[j];
            k++;
            j++;
        }
    }

}

// int [][] twoArray = {{5,7,3}, {7,0,12}, {8,1,3}};//объявили массив и
// заполнили
// for (int i = 0; i < 3; i++) { // по строкам
// for (int j = 0; j < 3; j++) {//по столбцам
// System.out.print(" " + twoArray[i][j] + " "); //вывод элемента
// }
// System.out.println();//перенос строки
// }