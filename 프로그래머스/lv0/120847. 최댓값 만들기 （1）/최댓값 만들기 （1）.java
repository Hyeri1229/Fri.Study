// 1번 풀이
class Solution {
    public int solution(int[] numbers) {
        int max1 = 0;
	int max2 = 0;
        
        for (int i = 0; i < numbers.length; i++) {
		if (max1 < numbers[i]) {
			max2 = max1;
			max1 = numbers[i];
		} else if (max2 < numbers[i]) max2 = numbers[i];
	}
		
        int answer = max1 * max2;
        return answer;
    }
}

// 2번 풀이
class Solution {
    public int solution(int[] numbers) {
	int max1 = 0;
	int max2 = 0;
	int index = 0;
        int answer = 0;
        
	for (int i = 0; i < numbers.length; i++) {
		if (max1 < numbers[i]) {
			max1 = numbers[i];
			index = i;
		}
	}

	for (int i = 0; i < numbers.length; i++) {
		if (i == index) continue;
		if (max2 < numbers[i]) {
			max2 = numbers[i];
		}
	}
	answer = max1*max2;
        return answer;
    }
}
