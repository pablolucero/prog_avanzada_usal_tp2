package clases_internas;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    private Node first;
    private int quantity;

    public void push(String s) {
        final Node node = new Node(s);
        node.value = s;

        if (isEmpty()) {
            node.next = null;
            first = node;
        } else {
            node.next = first;
            first = node;
        }
        quantity++;
    }

    public String pop() {
        if (!isEmpty()) {
            final Node node = first;
            first = node.next;
            quantity--;
            return node.value;
        } else {
            return null;
        }
    }

    public String peek() {
        if (!isEmpty()) {
            return first.value;
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void show() {
        List<String> listaValues = new ArrayList<>();
        Node node = this.first;
        while (node != null) {
            listaValues.add(node.value);
            node = node.next;
        }
        System.out.println(listaValues);
    }

    // clase interna
    public class Node {

        private String value;
        private Node next;

        public Node(String value) {
            this.value = value;
        }

        public Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push("a");
        s.push("b");
        s.push("c");
        s.show();
        System.out.println(s.peek());
        System.out.println(s.pop());
        s.show();
    }

}
