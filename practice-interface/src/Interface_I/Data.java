package Interface_I;

import java.util.ArrayList;

public class Data {
    public static double min(ArrayList<CustomCompare> lists) {
        double min = lists.get(0).getDataToCompare();
        for (CustomCompare item : lists) {
            if (item.getDataToCompare() < min) {
                min = item.getDataToCompare();
            }
        }
        return min;
    }

    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[minPos].compareTo(a[j]) > 0) {
                    minPos = j;
                }
            }
            Comparable temp = a[i];
            a[i] = a[minPos];
            a[minPos] = temp;
        }
    }
}

// ไชยภัทร ศรีอำไพ 6510450305

