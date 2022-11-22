class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int next = 0;
        for(int i = 0; i < k; i++) {
            answer = numbers[next];
            next += 2;
            if(next > numbers.length-1) next -= numbers.length;
        }
        
        
        
        return answer;
    }
}