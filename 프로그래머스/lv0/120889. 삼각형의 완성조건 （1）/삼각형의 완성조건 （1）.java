class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        int index = 0;
        
        // 가장 긴 변의 길이 및 인덱스 구하기
        for (int i = 0; i < sides.length; i++) {
            if (sides[i] > max) {
                max = sides[i];
                index = i;
            }    
        } 
        
        // 가장 긴 변을 제외한 두 변의 합 구하기
        int sum = 0;
        for (int i = 0; i < sides.length; i++) {
            if (i != index) sum += sides[i];
        }
        
        if (max < sum) answer = 1;
        else answer = 2;
        
        return answer;
    }
}