package Linked_list;

public class Main {
    public static void main(String[] args) {
        LinkedList numbers = new LinkedList();

        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addFirst(5);
        numbers.add(1,15);

        //리스트 전체 값 출력
        System.out.println(numbers);
        //맨앞의 삭제된 값 출력
        System.out.println(numbers.removeFirst());
        //리스트 전체 값 출력
        System.out.println(numbers);
        //원하는 인덱스의 삭제된 값 출력 (20)
        System.out.println(numbers.remove(2));
        //리스트 전체 값 출력
        System.out.println(numbers);

    }
}
