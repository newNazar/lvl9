public class Main {
    //для ArrayList
    /*
    public static void main(String[] args) {
        // Создаем объект ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Добавляем элементы в список
        arrayList.add("Первый");
        arrayList.add("Второй");
        arrayList.add("Третий");

        System.out.println("Первый элемент: " + arrayList.getFirst());
        System.out.println("Последний элемент: " + arrayList.getLast());
        System.out.println("Размер списка: " + arrayList.size());

        //Добавляем элемент по индексу
        arrayList.add(2,"Новый Третий");
        System.out.println("\n(add:index)Элементы списка:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        // Устанавливаем новое значение для элемента по индексу
        arrayList.set(1, "Измененный Второй");

        System.out.println("\n(set)Элементы списка:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        // Удаляем элемент по индексу
        arrayList.remove(0);

        System.out.println("\n(remove)Элементы списка после удаления:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        // Проверяем наличие элемента в списке
        String searchElement = "Измененный Второй";
        if (arrayList.contains(searchElement)) {
            System.out.println("\n(contains)Элемент \"" + searchElement + "\" найден в списке.");
        } else {
            System.out.println("\n(contains)Элемент \"" + searchElement + "\" не найден в списке.");
        }
        arrayList.clear();
        if (arrayList.isEmpty()) System.out.println("\n(clear)Список очищен!");
    }

     */

    //для LinkedList
    /*
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Первый");
        linkedList.add("Второй");
        linkedList.add("Третий");

        System.out.println("Элементы списка:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        linkedList.add(3, "Ещё четвёртый");
        System.out.println("\nНовый элемент: "+linkedList.get(3));

        System.out.println("\nПервый элемент: " + linkedList.getFirst());
        System.out.println("\nПоследний элемент: " + linkedList.getLast());

        linkedList.set(1, "Измененный Второй");
        System.out.println("\n(set)Элементы списка после изменения:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        linkedList.remove(0);
        System.out.println("\n(remove)Элементы списка после удаления:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        // Проверяем наличие элемента в списке
        String searchElement = "Измененный Второй";
        if (linkedList.contains(searchElement)) {
            System.out.println("\n(contains)Элемент \"" + searchElement + "\" найден в списке.");
        } else {
            System.out.println("\n(contains)Элемент \"" + searchElement + "\" не найден в списке.");
        }

        System.out.println("\nРазмер списка: " + linkedList.size());

        linkedList.clear();
        System.out.println("\nСписок пуст:" + linkedList.isEmpty());
    }

     */
    //для Queue
    /*
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println("Размер очереди: " + queue.size());
        System.out.println("Первый элемент: " + queue.peek());

        System.out.println("Извлечен элемент: " + queue.poll());
        System.out.println("Новый первый элемент: " + queue.peek());
        queue.clear();
        System.out.println("Список пуст! Текущий размер списка : "+queue.size());
    }
    */
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Размер очереди: " + stack.size());
        System.out.println("Первый элемент: " + stack.peek());

        System.out.println("Извлечен элемент(2й): " + stack.remove(1));
        System.out.println("Текущий элемент(2й): " + stack.get(1));
        stack.clear();
        System.out.println("Список пуст! Текущий размер списка : "+stack.size());

    }
}

