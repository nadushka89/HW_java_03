import java.util.ArrayList;
import java.util.Random;

// 2.Пусть дан произвольный список целых чисел, удалить из него четные числа

public class TaskHome02_03 {
    public static void main(String[] args) {
        Random rn = new Random();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            arr.add(rn.nextInt(1, 100));
        }
        System.out.println(arr);
        DeleteNumber(arr);
        System.out.println(arr);
    }
    public static void DeleteNumber(ArrayList<Integer> list) {
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 0)
                list.remove(i);
            else
                i++;
        }
    }
}
