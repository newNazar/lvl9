import java.util.*;

public class ArrayList<T>  {
    private static final int DEFAULT_CAPACITY = 2;
    private Object[] elements;
    private int size;

    public ArrayList(int initCapacity) {
        if (initCapacity <= 0) {
            throw new IllegalArgumentException();
        }
        elements = new Object[initCapacity];
    }
    public ArrayList(){
        this(DEFAULT_CAPACITY);
    }
    public void add(T element){
        resizeArray();
        elements[size]=element;
        size++;
    }
    private void resizeArray(){
        if(elements.length==size ){
            Object[] newArray = new Object[elements.length +2];
            System.arraycopy(elements, 0, newArray,0,size);
            elements=newArray;
        }
    }
    public void add(int index, T element){
        Objects.checkIndex(index, size+1);
        resizeArray();
        System.arraycopy(elements, index, elements, index+1, size - index);
        elements[index]=element;
        size++;
    }
    public T get(int index){
        Objects.checkIndex(index, size);
        return (T) elements[index];
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
        return get(size-1);
    }
    public void set(int index, T element){
        Objects.checkIndex(index, size);
        elements[index]=element;
    }
    public T remove(int index){
        Objects.checkIndex(index, size);
        T removeElement = (T) elements[index];
        System.arraycopy(elements, index+1, elements, index, size-index-1);
        size--;
        return removeElement;
    }
    public boolean contains(Object element){
        for(int i =0; i<size;i++){
            if(element.equals(elements[i])){
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return size ==0;
    }
    public int size(){
        return size;
    }
    public void clear(){
        size = 0;
        elements = new Object[DEFAULT_CAPACITY];
    }

}
