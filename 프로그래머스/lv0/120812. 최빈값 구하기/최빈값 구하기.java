class Solution {
    public int solution(int[] array) {
        int[] count = new int[1000];
		int answer = 0;
		int max = 0;
		
        // 0~1000까지 길이의 count배열 만들어서
        // array 배열에 있는 값의 인덱스만 카운트하기
		for (int i = 0; i < array.length; i++) {
			count[array[i]]++;
		}
		
		for (int i = 0; i < count.length; i++) {
			// 카운트 횟수 제일 높은 값 구하기
			if (count[i] > max) {
				max = count[i];
				answer = i;
			}
			else if (count[i] == max) {
                // 카운트 갑 같으면 -1 출력
				answer = -1;
			}
		}
        return answer;
    }
}