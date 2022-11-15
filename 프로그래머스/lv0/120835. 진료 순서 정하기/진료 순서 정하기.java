import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] emergencyCopy = new int[emergency.length];
		int[] answer = new int[emergency.length];
		
		// emergency 배열과 똑같은 배열 만들기
		for (int i = 0; i < emergency.length; i++) {
			emergencyCopy[i] = emergency[i];
		}
		
		// emergency 배열 -> 오름차순 정렬
		Arrays.sort(emergencyCopy); // 3 24 76
		int num = emergency.length;
		
		// emergency와 emergencyCopy 비교해서 작은 것부터 뒷 순서 배정
		for (int i = 0; i < emergency.length; i++) {
			for (int j = 0; j < emergency.length; j++) {
				if (emergencyCopy[i] == emergency[j]) answer[j] = num;
			}
			num--;
		}
        
        return answer;
    }
}