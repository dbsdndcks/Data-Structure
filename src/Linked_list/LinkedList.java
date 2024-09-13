package Linked_list;

public class LinkedList {
    private Node head; //맨 처음 노드
    private Node tail; //맨 마지막 노드
    private int size = 0;

    //Node 클래스 : 데이터와 다음 노드의 주소를 저장할수 있어야 한다
    private class Node {
        private Object data; //저장할 데이터 값
        private Node next; // 다음 노드를 가르킨다

        public Node(Object input) {
            this.data = input;
            this.next = null;
        }

    }

    //addFirst 메서드 : 최초 노드를 생성하는 메서드
    public void addFirst(Object input) {
        Node newNode = new Node(input);
        newNode.next = head;
        head = newNode;
        size++;
        if (head.next == null) {
            tail = head;
        }
    }

    //addLast 메서드 : 데이터가 하나 이상일때, 마지막 노드를 생성하는 메서드
    public void addLast(Object input){
        Node newNode = new Node(input);
        if (size == 0) {
            addFirst(input);
        } else {
            tail.next = newNode;
            tail = newNode;
            size++;
        }

    }

    //노드를 탐색하는 메서드
    Node node(int index) {
        Node x = head;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    //노드를 인덱스 위치에 추가하는 메서드
    public void add(int index, Object input) {
        //맨앞에 노드를 추가하는 경우
        if (index == 0) {
            addFirst(input);
        }else{
            Node newNode = new Node(input); //새로 추가된 노드
            Node temp1 = node(index - 1); //추가될 노드 인덱스 이전 위치 노드
            Node temp2 = temp1.next; //추가될 노드 인덱스 다음 위치의 노드

            temp1.next = newNode; //노드 연결
            newNode.next = temp2; //노드 연결


        }
    }

    //첫번쨰 노드부분을 지우는 메서드
    public Object removeFirst(){
        Node temp = head;
        head = head.next;
        Object returnData = temp.data;
        temp = null;
        size--;
        return returnData;
    }

    //인덱스 위치의 노드를 삭제하는 메서드
    public Object remove(int index) {
        if (index == 0) {
            return removeFirst();
        }
        Node temp = node(index - 1);
        Node todoDelted = temp.next;
        temp.next = temp.next.next;
        Object retrunData = todoDelted.data;
        if (temp.next == tail) {
            tail = temp;
        }
        return retrunData;
    }

    //리스트 값을 출력하는 메서드
    public String toString() {
        if (head == null) {
            return "[]";
        }
        Node temp = head;
        String str = "[";

        while (temp.next != null) {
            str += temp.data + ", ";
            temp = temp.next;
        }
        str += temp.data;

        return str + "]";
    }

}
