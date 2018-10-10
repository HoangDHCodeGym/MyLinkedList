public class MyLinkedList<T> {
    Node head;
    Node tail;
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

    public void addLast(T data) {
        Node temp = head;
        while (temp.next != null ) {
            temp = temp.next;
        }
        temp.next = new Node(data);
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
        numNodes--;
    }

    public void removeData(T data) {
        Node temp = head;
        while (temp.next != null) {
          if (temp.next.getData() == data) {
            temp.next = temp.next.next;
          }
          temp = temp.next;
        }
    }

    public void printList() {
        Node temp = head;
        System.out.println("My List:");
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }
}
