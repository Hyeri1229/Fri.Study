class Solution {
    public int solution(int n, int k) {
        int answer = n*12000 + k*2000;
        if (n/10 > 0) answer -= 2000*(n/10);
        
        return answer;
    }
}