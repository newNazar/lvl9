import java.util.NoSuchElementException;
import java.util.Objects;

public class Stack<T> {
    private Node<T> top;
    private int size;

    static class Node<T> {
        T element;
        Node<T> next;

        public Node(T element) {
            this.element = element;
            this.next = null;
        }
    }

    // Добавить элемент
    public void push(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.next = top;
        top = newNode;
        size++;
    }
    private Stack.Node<T> getNodeByIndex(int index){
        Stack.Node<T> current = top;
        for (int i = 0; i<index;i++){
            current = current.next;
        }
        return current;
    }
    //Получитб элемент по индексу
    public T get(int index){
        Objects.checkIndex(index, size);
        return getNodeByIndex(index).element;
    }
    //Удалить элемент по индексу
    public T remove(int index){
        Objects.checkIndex(index, size);
        T removedElement;
        Stack.Node<T> prev = getNodeByIndex(index - 1);
        removedElement = prev.next.element;
        prev.next = prev.next.next;

    size --;
            return removedElement;
    }

    // Первый элемент
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return top.element;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void clear() {
        top = null;
        size = 0;
    }
}