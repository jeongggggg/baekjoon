package baekjoon.anything;

import java.io.*;
import java.util.*;

public class B_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 좌표 저장용 배열
        int [][] coords = new int[N][2];

        // 좌표 입력 받기
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            coords[i][0] = Integer.parseInt(st.nextToken());
            coords[i][1] = Integer.parseInt(st.nextToken());
        }

        // x 기준 → 같으면 y 기준 정렬
        Arrays.sort(coords, (a, b) -> {
            if(a[0] == b[0]){ // x가 같으면
                return a[1] - b[1]; // y 비교
            }
            return a[0] - b[0]; // x 비교
        });

        // 출력 준비
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            sb.append(coords[i][0]).append(" ").append(coords[i][1]).append("\n");
        }

        // 출력
        System.out.print(sb);
    }
}
