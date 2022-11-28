import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
		
        // my_string 길이만큼 for문 반복
        // 숫자가 있으면 배열 arr에 저장
        // Character.getNumericValue(char ch) -> 문자에 해당하는 숫자값 출력
		for (int i = 0; i < my_string.length(); i++) {
			Character temp = my_string.charAt(i);
			if (temp >= '0' && temp <= '9') arr.add(Character.getNumericValue((char)temp));
		}
		
        // arr에 담긴 값의 수만큼 길이 지정해서 int 배열 초기화
		int[] result = new int[arr.size()];
		
        // int 배열에 arr 값 저장 (Arrays.sort 하기위해서!)
		for (int i = 0; i < arr.size(); i++) {
			result[i] = arr.get(i);
		}
		
		Arrays.sort(result);
        
        return result;
    }
}