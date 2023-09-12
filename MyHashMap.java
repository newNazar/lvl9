public class MyHashMap<K, V> {

    static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private static final int DEFAULT_CAPACITY = 16; // Размер по умолчанию
    private Node<K, V>[] table;
    public MyHashMap() {
        table = new Node[DEFAULT_CAPACITY];
    }

    //Хеш-кода ключа
    private int getHashCode(K key) {
        return key.hashCode() % DEFAULT_CAPACITY;
    }
    // Добавление
    public void put(K key, V value) {
        int hashCode = getHashCode(key);
        Node<K, V> newNode = new Node<>(key, value);

        if (table[hashCode] == null) {
            table[hashCode] = newNode;
        } else {
            Node<K, V> currentNode = table[hashCode];
            while (currentNode.next != null) {
                if (currentNode.key.equals(key)) {
                    currentNode.value = value;
                    return;
                }
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }
    // Удаление элемента по ключу
    public void remove(K key) {
        int hashCode = getHashCode(key);
        Node<K, V> currentNode = table[hashCode];
        Node<K, V> prevNode = null;

        while (currentNode != null) {
            if (currentNode.key.equals(key)) {
                if (prevNode == null) {
                    table[hashCode] = currentNode.next;
                } else {
                    prevNode.next = currentNode.next;
                }
                return;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
    }

    public void clear() {
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            table[i] = null;
        }
    }

    // Получение значения по ключу
    public V get(K key) {
        int hashCode = getHashCode(key);
        Node<K, V> currentNode = table[hashCode];

        while (currentNode != null) {
            if (currentNode.key.equals(key)) {
                return currentNode.value;
            }
            currentNode = currentNode.next;
        }

        return null; //если ключ не найден
    }
    public int size() {
        int count = 0;
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            Node<K, V> currentNode = table[i];
            while (currentNode != null) {
                count++;
                currentNode = currentNode.next;
            }
        }
        return count;
    }
}