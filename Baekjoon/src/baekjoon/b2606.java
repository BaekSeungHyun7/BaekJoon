package baekjoon;

import java.util.*;

public class b2606 {
	static int count, num, connections;
    static boolean[] visited;
    static List[] computers;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        num = sc.nextInt(); //컴퓨터 수
        connections = sc.nextInt(); //네트워크 상에서 직접 연결된 컴퓨터 쌍의 수
        visited = new boolean[num+1]; // 방문 여부를 기록할 boolean 배열 초기화
        computers = new List[num+1]; // 각 컴퓨터의 연결 관계를 저장할 리스트 배열 초기화
        count = 0; // 감염된 컴퓨터 수 초기화
        //인덱스는 0부터 시작하므로 +1로 1번 컴퓨터임을 인지하기 쉽게
        
        // 컴퓨터 수만큼 리스트 초기화
        for(int i=1; i<num+1; i++) {
            computers[i] = new ArrayList<Integer>();
        }
        
        // 연결된 컴퓨터 쌍의 수만큼 반복하면서 연결 정보 입력
        for(int i = 1; i<connections+1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            // a와 b가 서로 연결되어 있으므로 양방향으로 리스트에 추가
            computers[a].add(b);
            computers[b].add(a);
        }
        
        // 1번 컴퓨터부터 DFS 시작
        dfs(1);
        
        // 1번 컴퓨터를 제외한 감염된 컴퓨터 수 출력
        System.out.println(count-1); // 시작 지점 카운트 빼주기
    }
    
    private static void dfs(int start) {
        if(!visited[start]) { // 현재 컴퓨터가 방문되지 않았다면
            visited[start] = true; // 방문 표시
            count++; // 감염된 컴퓨터 수 증가
            // 현재 컴퓨터와 연결된 모든 컴퓨터에 대해 DFS 재귀 호출
            for(int i=0; i<computers[start].size(); i++) {
                dfs((int)computers[start].get(i));
            }
        }
    }
}

