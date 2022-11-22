class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

		// numbers배열 2배로 만들기
		int[] temp = new int[numbers.length*2];
		for(int i = 0; i < temp.length; i++) {
			if(i > numbers.length-1) {
				temp[i] = numbers[i-numbers.length];
			} else {
				temp[i] = numbers[i];
			}
		}


		// 배열 출력
		if (direction.equals("right")) {
			for(int i = 0; i < answer.length; i++) {
				answer[i] = temp[i+(answer.length-1)];
			}
		} else {
			for(int i = 0; i < answer.length; i++) {
				answer[i] = temp[i+1];
			}
		}
        return answer;
    }
}