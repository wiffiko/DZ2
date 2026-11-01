package t2;

import java.util.ArrayList;
import java.util.List;

public class T2 {
    public static List<Integer> intersectionSorted(int[] list1, int[] list2) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < list1.length && j < list2.length) {
            if (list1[i] == list2[j]) {
                if (result.isEmpty() || result.get(result.size() - 1) != list1[i]) {
                    result.add(list1[i]);
                }
                i++;
                j++;
            } else if (list1[i] < list2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return result;
    }
}