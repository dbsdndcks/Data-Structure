package Do_It.Binary_Search_tree;

import java.util.ArrayList;

public class DFS {
    public static boolean[] visited = new boolean[9];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    //DFS 함수 정의
    public static void dfs(int x) {
        //현재 노드를 방문 처리
        visited[x] = true;
        System.out.println(x + " ");
        //현재 노드오 ㅏ연결된 다른 노드를 재귀적으로 방문
        for (int i = 0; i < graph.get(x).size(); i++) {
            int y = graph.get(x).get(i);
            if (!visited[y]) {
                dfs(y);
            }
        }
    }

    public static void main(String[] args) {
        // 그래프 초기화 (1-based index)
        for (int i = 0; i < 9; i++) {
            graph.add(new ArrayList<Integer>());
        }

        // 그래프 간선 추가 (무방향 그래프)
        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(2).add(1);
        graph.get(2).add(4);
        graph.get(2).add(5);
        graph.get(3).add(1);
        graph.get(3).add(6);
        graph.get(3).add(7);
        graph.get(4).add(2);
        graph.get(5).add(2);
        graph.get(6).add(3);
        graph.get(7).add(3);
        graph.get(7).add(8);
        graph.get(8).add(7);

        // DFS 탐색 시작 (1번 노드부터 탐색)
        dfs(1);
    }
}
