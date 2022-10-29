class Solution {
    public int[] solution(int n) {
        int length = 1;
        
        if (n%2 == 0) length = n/2;
        else length = n/2+1;
        
        int[] answer = new int[length];
        
        int temp = 0;
        for (int i = 1; i <= n; i++) {
            if(i%2 == 1) {
                answer[temp] = i;
                temp++;
            } 
        }
        
        return answer;
    }
}