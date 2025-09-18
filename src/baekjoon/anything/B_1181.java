package baekjoon.anything;
import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/1181
public class B_1181 {
    public static void main(String[] args) throws IOException{
        // N개의 단어 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 중복된 단어를 제한 하는 빈 값 생성
        Set<String> setList = new HashSet<>();

        // 입력 받은 데이터를 setList에 담기
        for(int i = 0; i < N; i++){
            setList.add(br.readLine());
        }

        // hashset은 순서를 보장하지 않기 때문에 정렬 불가능 -> 정렬하기 위해 set을 list로 변환 그래야 Collection.sort를 사용할 수 있음
        List<String> words = new ArrayList<>(setList);

        // 정렬을 위해 collection.sort 사용
        words.sort((a,b) -> {
           if(a.length() == b.length()){
               return a.compareTo(b); // 사전순 : a이 더 앞이면 음수
           }
            return a.length() - b.length(); // 길이 : a보다 더 짧으면 음수
        });

        // 출력 준비
        StringBuilder sb = new StringBuilder(); // 문자열을 하나씩 + 대신 가변 문자열 사용
        for(String word : words){
            sb.append(word).append("\n");
        }
        System.out.print(sb);
    }
}

// 개선해도 되는 부분
// HashSet 대신 TreeSet 사용 시 HashSet → List → sort() 과정이 필요 없어 코드가 간결해짐
// HashSet 보다 살짝 느릴 수 있지만 정렬이 자동이라는 장점이 있음
