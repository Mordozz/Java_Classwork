import java.util.Arrays;
import java.util.LinkedList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        Collections.reverse(list);
        System.out.println("Перевернутый список: " + list);

        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println("Очередь после добавления элемента: " + queue);
        System.out.println("Извлеченный из очереди элемент: " + queue.dequeue());
        System.out.println("Первый элемент очереди: " + queue.first());
    }
}
