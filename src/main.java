public class main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.append(100);
        list.append("а");
        list.append("а");

        System.out.println(list.head);
        System.out.println(list.tail);

    }
}
