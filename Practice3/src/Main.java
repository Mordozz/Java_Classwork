import java.util.*;

public class Main {
    public static void main(String[] args) {
        double sum = 0;
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
        int min = Collections.min(list);
        int max = Collections.max(list);

        for (int num : list) {
            sum += num;
        }
        double average = sum / list.size();

        // Выводим результаты
        System.out.println("Список после удаления: " + list);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);
    }
}
