package t3;

public class T3 {
    public static void countTemperatureStats(int[] temps) {
        int positive = 0, negative = 0, zero = 0;
        for (int t : temps) {
            if (t > 0) positive++;
            else if (t < 0) negative++;
            else zero++;
        }
        System.out.println("положительных " + positive +
            ", отрицательных " + negative +
            ", нулевых " + zero);
    }
}