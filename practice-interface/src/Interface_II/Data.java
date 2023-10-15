package Interface_II;

import java.util.Comparator;

public class Data {
    public static <T> double min(T[] objects, CustomComparator<T> comparator) {
        int min = 0;
        for (int i = 1; i < objects.length; i++) {
            if (comparator.compareData(objects[min], objects[i]) > 0) {
                min = i;
            }
        }
        return comparator.getData(objects[min]);
    }

    public static <T> void sort(T[] data, Comparator<T> comparator) {
        for (int i = 0; i < data.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < data.length; j++) {
                if (comparator.compare(data[i], data[j]) > 0) {
                    minPos = j;
                }
            }
            T temp = data[minPos];
            data[minPos] = data[i];
            data[i] = temp;
        }
    }
}

// ไชยภัทร ศรีอำไพ 6510450305
