import java.util.*;

class Solution {
    public ArrayList solution(String my_string) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
		
        // my_string 길이만큼 for문 반복
        // 숫자가 있으면 배열 arr에 저장
        // Character.getNumericValue(char ch) -> 문자에 해당하는 숫자값 출력
		for (int i = 0; i < my_string.length(); i++) {
			Character temp = my_string.charAt(i);
			if (temp >= '0' && temp <= '9') arr.add(Character.getNumericValue((char)temp));
		}
		
        Collections.sort(arr);
        
        return arr;
    }
}