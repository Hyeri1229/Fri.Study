class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        
        // num_list의 원소를 짝수인지 판별해서
        // 짝수면 answer의 0번 인덱스에 카운트
        // 홀수면 answer의 1번 인덱스에 카운트
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) answer[0]++;
            else answer[1]++;
        }
        
        return answer;
    }
}