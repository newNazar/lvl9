import java.util.NoSuchElementException;

public class Queue<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;

    static class Node<T> {
        T element;
        Node<T> next;

        public Node(T element) {
            this.element = element;
            this.next = null;
        }
    }

    // Добавить элемент в конец очереди
    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    // Удалить элемент из начала очереди
    public T poll() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T element = first.element;
        first = first.next;
        size--;
        return element;
    }
    // Вернуть первый элемент
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return first.element;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public int size() {
        return size;
    }
    public void clear(){
        first = null;
        last = null;
        size = 0;
    }
}