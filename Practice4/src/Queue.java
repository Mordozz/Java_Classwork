import java.util.LinkedList;

class Queue<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void enqueue(T item) {
        list.addLast(item);
    }

    public T dequeue() {
        return list.pollFirst();
    }

    public T first() {
        return list.peekFirst();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}