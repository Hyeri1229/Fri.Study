class Solution {
    public String solution(int age) {
        String answer = "";
        char[] planetAge = {'a','b','c','d','e','f','g','h','i','j'};
        
        // 나이의 범위가 1000까지 i 범위 1000으로 설정
        // 나이가 0이면 a 출력
        // 앞자리 수부터 하나씩 answer에 누적해서 출력
        for (int i = 1000; i > 0; i /= 10) {
            if (age == 0) answer += planetAge[0];
            if (age/i < 1) continue;
            answer += planetAge[age/i];
            age %= i;
        }
        
        return answer;
    }
}