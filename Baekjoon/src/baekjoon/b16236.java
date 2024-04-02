package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Position {
    int x, y, distance;

    public Position(int x, int y, int distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }
}

public class b16236 {
    static int[][] space;
    static int N, sharkSize = 2, eatCount = 0, time = 0;
    static Position sharkPos;
    static int[] dx = {-1, 0, 0, 1}; // 상, 좌, 우, 하
    static int[] dy = {0, -1, 1, 0};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        space = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                space[i][j] = scanner.nextInt();
                if (space[i][j] == 9) {
                    sharkPos = new Position(i, j, 0);
                    space[i][j] = 0; // 아기 상어 위치 초기화
                }
            }
        }

        while (true) {
            Position nextFish = findNearestFish();
            if (nextFish == null) break; // 먹을 수 있는 물고기가 없다면 종료

            // 물고기 먹기
            eatCount++;
            time += nextFish.distance; // 이동 시간 더하기
            sharkPos = new Position(nextFish.x, nextFish.y, 0);
            space[nextFish.x][nextFish.y] = 0; // 물고기 먹고 나서 빈 칸으로 변경

            if (eatCount == sharkSize) { // 크기만큼 물고기를 먹었다면 상어 크기 증가
                sharkSize++;
                eatCount = 0;
            }
        }

        System.out.println(time);
        scanner.close();
    }

    static Position findNearestFish() {
        boolean[][] visited = new boolean[N][N];
        Queue<Position> queue = new LinkedList<>();
        queue.add(sharkPos);
        visited[sharkPos.x][sharkPos.y] = true;

        Position result = null;
        while (!queue.isEmpty()) {
            Position current = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < N && !visited[nx][ny] && space[nx][ny] <= sharkSize) {
                    visited[nx][ny] = true;
                    queue.add(new Position(nx, ny, current.distance + 1));

                    if (space[nx][ny] > 0 && space[nx][ny] < sharkSize) {
                        if (result == null || result.distance > current.distance + 1 ||
                                (result.distance == current.distance + 1 && (result.x > nx || (result.x == nx && result.y > ny)))) {
                            result = new Position(nx, ny, current.distance + 1);
                        }
                    }
                }
            }
        }
        return result;
    }
}
