public class MyLinkedList<T> {
    Node head;
    int numNodes;

    public MyLinkedList(T data) {
        this.head = new Node(data);
    }

    private class Node<T> {
        private Node next;
        private T data;

        public Node() {
        }

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return this.data;
        }
    }

    public void add(int index, T data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(T data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void remove(int index) {
        Node temp = this.get(index-1);
        temp.next = temp.next.next;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }
}
