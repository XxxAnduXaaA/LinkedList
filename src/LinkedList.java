public class LinkedList<T> {

    //TODO: сделать двухстороннесть списка, добавить функцию поиска (чтобы искала оптимальный маршрут) и функцию удаления, сделать итерацию
    // обращение к головному элементу и хвостовому

    public Node head;
    public Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void append(T data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;

        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
            tail = newNode;


        }
    }

    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


}
