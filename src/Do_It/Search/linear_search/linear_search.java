package Do_It.Search.linear_search;

import java.util.Scanner;

public class linear_search {

    static int seqSearch(int[] x, int num, int key) {
        int result = -1;

        x[num] = key;

        for (int i = 0; i < x.length; i++) {
            if (x[i] == key) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("요소수 : ");
        int num = sc.nextInt();
        int[] x = new int[num + 1];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] = ");
            x[i] = sc.nextInt();
        }

        System.out.println("검색할 값");
        int key = sc.nextInt();
        int id = seqSearch(x, num, key);

        if (id == -1) {
            System.out.println("그 값의 요소가 없습니다");
        } else {
            System.out.println("그 값은 x[" + id + "]에 있씁니다");
        }
    }
}
