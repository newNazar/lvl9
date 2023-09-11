import java.util.NoSuchElementException;
import java.util.Objects;

public class LinkedList<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;
    static class Node <T>{
        T element;
        Node<T> next;
        Node<T> previous ;
        public Node(T element){

            this.element = element;
        }
    }
    public void add(T element){
        Node<T> newNode = new Node<>(element);
        if(first == null){
            first = last =newNode;
        }
        else{
            newNode.previous = last;
            last.next = newNode;
            last = newNode;
        }
        size++;
    }
    public void add(int index, T element){
        Objects.checkIndex(index, size+1);
        Node<T> newNode = new Node<>(element);
        if(first==null){
            first = last = newNode;
        }
        else if(index == 0){
            newNode.next = first;
            first.previous = newNode;
            first = newNode;
        }
        else if (index ==size){
            newNode.previous = last;
            last.next = newNode;
            last = newNode;
        }
        else{
             Node<T> current = getNodeByIndex(index-1);
             newNode.next = current.next;
             newNode.previous = current;
             current.next.previous = newNode;
             current.next = newNode;
        }
        size++;

    }
    private Node<T> getNodeByIndex(int index){
        Node<T> current = first;
        for (int i = 0; i<index;i++){
            current = current.next;
        }
        return current;
    }
    public void set(int index, T element){
        Objects.checkIndex(index, size);
        Node<T> node = getNodeByIndex(index);
        node.element = element;
    }
    public T get(int index){
        Objects.checkIndex(index, size);
        return getNodeByIndex(index).element;
    }
    public T getFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return get(0);
    }
    public T getLast(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return get(size - 1);
    }
    public T remove(int index){
        Objects.checkIndex(index, size);
        T removedElement;
        if(index == 0) {
            removedElement = first.element;
            first = first.next;
            if(first == null){
                last = null;
            }
            else first.previous = null;
        }
        else if (index == size - 1) {
            removedElement = last.element;
            last = last.previous;
            last.next = null;
        }
        else{
            Node<T> prev = getNodeByIndex(index - 1);
            removedElement = prev.next.element;
            prev.next = prev.next.next;
            prev.next.previous = prev;
        }
            size --;
            return removedElement;
        }
        public boolean contains(T element){
            Node<T> current = first;
            for (int i = 0; i<size;i++){
                if(current.element.equals(element)){
                    return true;
                }
                current = current.next;
            }
            return false;
        }
        public boolean isEmpty(){

        return first == null;
        }
        public int size(){
        return size;
        }
        public void clear(){
        first = last = null;
        size = 0;
        }

    }

