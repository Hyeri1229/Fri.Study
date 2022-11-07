class Solution {
    public String solution(String my_string) {
        String answer = "";
        // index 변수를 String의 마지막 값으로 초기화
        int index = my_string.length()-1;
		
        // String 변수.charAt(index) -> String 변수의 index 값에 맞는 문자를 리턴해줌!
        // index는 0부터 시작!
        // answer에 String 문자열의 마지막 값부터 누적해서 입력 
		for (int i = 0; i < my_string.length(); i++) {
			answer += my_string.charAt(index);
			index--;
		} 
        return answer;
    }
}