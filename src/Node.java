public class Node<T> {
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