import t1.T1;
import t2.T2;
import t3.T3;

public class App {
    public static void main(String[] args) {
        // Тест задачи 1
        System.out.println("Задача 1: " +
            T1.countCommonDevices(new int[]{4, 8, 12}, new int[]{2, 8, 12, 16}));

        // Тест задачи 2
        System.out.println("Задача 2: " +
            T2.intersectionSorted(new int[]{2, 4, 8, 10}, new int[]{1, 4, 8}));

        // Тест задачи 3
        System.out.print("Задача 3: ");
        T3.countTemperatureStats(new int[]{-2, 0, 3, 0});
    }
}