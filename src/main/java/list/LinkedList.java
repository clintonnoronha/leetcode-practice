package list;

public class LinkedList <T> {
    
    Node<T> head;
    
    public static class Node <T> {
        T data;
        Node<T> next;
        
        Node() { }
        
        Node(T data) {
            this.data = data;
            this.next = null;
        }
        
        Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }
    
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        
        if (head == null) {
            head = newNode;
            return;
        }
        
        Node<T> curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        
        curr.next = newNode;
    }

    public void remove(T data) {
        if (head == null)
            return;

        Node<T> curr = head;
        Node<T> prev = head;

        while (curr != null) {
            if (curr.data == data && curr == head) {
                head = head.next;
                curr = head;
                prev = curr;
            } else if (curr.data == data) {
                prev.next = curr.next;
                curr = curr.next;
            } else {
                if (curr != head)
                    prev = curr;
                curr = curr.next;
            }
        }
    }

    public T middle() {
        if (head == null)
            return null;

        Node<T> fast = head;
        Node<T> slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow.data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<T> curr = head;
        while (curr != null) {
            sb.append(curr.data).append(", ");
            curr = curr.next;
        }
        if (head != null) {
            int length = sb.length();
            sb.delete(length - 2, length);
        }
        sb.append("]");
        return sb.toString();
    }
}
