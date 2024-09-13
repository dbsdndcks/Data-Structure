package Do_It.Search.linear_search;

import java.util.Scanner;

public class linear_scanning {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {6, 4, 3, 2, 1, 9, 8};
        int num = sc.nextInt();

        System.out.println("   |  0  1  2  3  4  5  6");  // 숫자의 간격을 두 칸으로 맞춤
        System.out.println("---+-----------------------");

        for (int i = 0; i < num; i++) {
            // 위쪽 '*' 출력
            System.out.print("   |");
            for (int j = 0; j < i; j++) {
                System.out.print("   ");  // 세 칸씩 간격을 맞춤
            }
            System.out.println("  *");  // '*' 출력 후 줄바꿈

            // 인덱스와 배열 출력
            System.out.printf("%2d | ", i);  // 숫자의 자리수 확보 (2칸 확보)
            for (int k : arr) {
                System.out.printf("%2d ", k);  // 배열 숫자도 두 칸씩 확보하여 출력
            }
            System.out.println();

        }
    }
}
