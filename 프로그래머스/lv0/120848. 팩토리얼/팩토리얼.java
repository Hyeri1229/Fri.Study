class Solution {
    public int solution(int n) {
        int multiple = 1;
        int answer = 1;

        while (multiple*answer < n) {
            answer++;
            multiple *= answer;
        }
        
        
        return answer;
    }
}