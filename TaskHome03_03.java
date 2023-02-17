import java.util.ArrayList;
import java.util.Random;

// 3.Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее арифметическое этого списка.

public class TaskHome03_03 {
    public static void main(String[] args) {
        Random rn = new Random();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            arr.add(rn.nextInt(1, 100));
        }
        System.out.println(arr);
        int minNum = minNumber(arr);
        System.out.printf("Минимальное значение в массиве: %d\n", minNum);
        int maxNum = maxNumber(arr);
        System.out.printf("Максимальное значение в массиве: %d\n", maxNum);
        double avrNum = averageNumber(arr);
        System.out.printf("Среднее арифметическое значение в массиве равно: %s\n",avrNum);
        
    }
    public static int minNumber(ArrayList<Integer> arr) {
        int min = arr.get(0);
        for (int number : arr) {
            if (number < min)
                min = number;
        }
        return min;
    }
    public static int maxNumber(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int number : arr) {
            if (number > max)
                max = number;
        }
        return max;
    }
    public static double averageNumber(ArrayList<Integer> arr){
        int sum = 0;
        for (int number : arr) {
            sum+=number;
        }
        double avrNumber = Double.valueOf(sum)/Double.valueOf(arr.size());
        return avrNumber;
    }
}
