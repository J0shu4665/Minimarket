package Minimarket;

public class hr {

    public static class Node {

        Node head, next, tail;
        Node prev;
        Object data;
        int size = 0;

        Node() {
        }

        Node(Object data) {
            this.data = data;
        }

        Node(Object data, Node next, Node prev) {
            this.data = data;
            this.next = next;

        }

        int size() {
            return size;
        }

        boolean isEmpty() {
            return size == 0;
        }

        void makeEmpty() {
            head = tail = null;
            size = 0;
            
        }

        void add(int index, Node input) {
            Node p = head;
            if (index == size) {
                        addLast(input);
                    
            } else{
            do {
                    index--;
                    p = p.next;
                    
            } while (index > 0);
            input.prev = p;
            input.next = p.next;
                    p.next.prev = input;
                    p.next = input;
                    size++;
            
        }
            
        }

        void addFirst(Node input) {
            if (isEmpty()) {
                head = input;
                tail = input;
            } else {
                input.next = head;
                head.prev = input;
                head = input;
            }
            size++;
        }

        void addLast(Node input) {
            if (isEmpty()) {
                head = input;
                tail = input;
            } else {
                input.prev = tail;
                tail.next = input;
                tail = input;
            }
            size++;
        }

        void removeAll() {
            makeEmpty();
        //  System.out.println("Kosong!");
        }

        void removeFirst() {
            Node p = head;
            if (!isEmpty()) {
                if (head == tail) {
                    head = tail = null;
                }else{
                    head.next.prev = null;
                    head = p.next;
                }size--;
                
            }else{
                System.out.println("Data Kosong!");
            }
        }

        void removeLast() {
            Node p = tail;
            if (!isEmpty()) {
                if (head == tail) {
                    head = tail = null;
                }else{
                    tail.prev.next = null;
                    tail = p.prev;
                }size--;
                
            }else{
                System.out.println("Data Kosong!");
            }
        }
        void removeAt(int index){
            Node p = head;
            if(isEmpty()){
                System.out.println("Data Kosong");
            }else if (size == 0){
                head=tail=null;
            }else{
                if(index == 0){
                    removeFirst();
                }else if(index == size-1){
                    removeLast();
                }else{
                    for (int i = 0; i < index; i++) {
                        p = p.next;
                    }
                    p.prev.next = p.next;
                    p.next.prev = p.prev;
                    
                }
            }
        }
        void insertAfter(Object key, Node input) {
            Node p = head;
            do {
                    if (p.data.equals(key)) {
                        if (p.data.equals(tail.data)) {
                        addLast(input);
                        break;
                    }
                    input.prev = p;
                    input.next = p.next;
                    p.next.prev = input;
                    p.next = input;
                    size++;
                    break;
                
                    }p = p.next;
                    
            } while (p != null);

        }

        void insertBefore(Object key, Node input) {
            Node p = head;
            do {
                    if (p.data.equals(key)) {
                        if (p.data.equals(head.data)) {
                        addFirst(input);
                        break;
                    }
                    input.prev = p.prev;
                    input.next = p;
                    p.prev.next = input;
                    p.prev = input;
                    size++;
                    break;
                
                    }p = p.next;
                    
            } while (p != null);
        }

        void printFirst() {
            Node p = head;
            while (p != null) {
                System.out.print(p.data + " -- ");
                p = p.next;
            }
            System.out.println();
        }
        Object getData(int index){
            Node p = head;
            for (int i = 0; i < index; i++) {
                p = p.next;
            }
            return p.data;
        }
//        void spasi() {
//            System.out.println();
//        }

        void printLast() {
            Node p = tail;
            while (p != null) {
                System.out.print(p.data + " -- ");
                p = p.prev;
            }
            System.out.println();
            System.out.println();
        }
        boolean contains(Object key){
            Node p =head;
         
                for (int i = 0; i < size; i++) {
                    if(p.data == key) {
                        System.out.println("ada");
                        return true;
                    }
                    p = p.next;
                }
                System.out.println("gk ada");
            return false;
        }
    }

    public static void main(String[] args) {
        Node list = new Node();

        list.addFirst(new Node(5));
        list.addFirst(new Node(4));
        list.addFirst(new Node(3));
        list.addFirst(new Node(2));
        list.addFirst(new Node(1));
        list.addLast(new Node(6));
        list.insertBefore(5, new Node(4.5));
        list.printFirst();

        list.printLast();
        list.insertBefore(6, new Node(5.5));
        list.printFirst();
        list.printLast();
        list.addLast(new Node(7));
        list.printFirst();
        list.printLast();
        list.contains(1);
//        list.removeLast();
//        list.printFirst();
//        list.printLast();
//        list.removeLast();
//        list.printFirst();
//        list.printLast();
//        list.addFirst(new Node(1));
//        list.printFirst();
//        list.printLast();
//        list.add(5, new Node (9999));
//        list.printFirst();
//        list.printLast();
//        list.removeAt(5);
//        list.printFirst();
//        list.printLast();
//        Object dataa = list.getData(2);
//        System.out.println(dataa);
        
    }

}
