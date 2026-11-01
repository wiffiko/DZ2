package t1;

public class T1 {
    public static int countCommonDevices(int[] list1, int[] list2) {
        int i = 0, j = 0, count = 0;
        while (i < list1.length && j < list2.length) {
            if (list1[i] == list2[j]) {
                count++;
                i++;
                j++;
            } else if (list1[i] < list2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return count;
    }
}