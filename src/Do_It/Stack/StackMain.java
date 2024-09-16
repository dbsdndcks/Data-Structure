package Do_It.Stack;

import java.util.Scanner;

public class StackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntStack stack = new IntStack(64); //최대 64개를 푸시할 수 있는 스택 생성

        while (true) {
            System.out.println(); //메뉴 구분을 위한 빈행 추가
            System.out.printf("현재 데이터 개수: %d / %d\n", stack.size(),stack.getCapacity());
            System.out.print("(1) 푸시    (2) 팝   (3) 피크  (4) 덤프  (0) 종료" );

            int menu = sc.nextInt();
            if(menu == 0)break;

            int x;
            switch (menu) {
                case 1:
                    System.out.print("데이터: ");
                    x = sc.nextInt();
                    try {
                        stack.push(x);
                        System.out.printf("데이터 값 <%d> 푸시 완료\n",x);
                    } catch (IntStack.OverFlowIntStackException e) {
                        e.printStackTrace();
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;
                case 2:
                    try {
                        x = stack.pop();
                        System.out.printf("팝으로 나온 데이터 : %d", x);
                    } catch (IntStack.EmptyIntStackException e) {
                        e.printStackTrace();
                        System.out.println("스택이 비어있습니다");
                    }
                    break;
                case 3:
                    try {
                        x = stack.peek();
                        System.out.printf("피크로 나온 데이터 : %d", x);
                    } catch (IntStack.EmptyIntStackException e) {
                        e.printStackTrace();
                        System.out.println("스택이 비어있습니다");
                    }
                    break;
                case 4:
                    stack.dump();
                    break;
            }
        }

    }
}
