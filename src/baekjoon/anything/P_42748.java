package baekjoon.anything;

import java.util.Arrays;

public class P_42748 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++){
            int start = commands[i][0] -1; // 시작(0-based)
            int end = commands[i][1]; // 끝(copyOfRange는 end 미포함)
            int k = commands[i][2] - 1; // k번째(0-based)

            // array 배열에서 start번째(포함) ~ end번째(미포함) 구간을 잘라서 새로운 배열 생성
            int[] sub = Arrays.copyOfRange(array, start, end);
            // 잘라낸 sub 배열을 오름차순 정렬
            Arrays.sort(sub);
            // 정렬된 배열에서 k번째(0-based 인덱스라서 실제 문제 기준으론 k번째)를 꺼냄
            answer[i] = sub[k];
        }

        return answer;
    }
}
