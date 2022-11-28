import java.util.*;

class Solution {
    public int solution(String my_string) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for (int i = 0; i < my_string.length(); i++) {
			Character temp = my_string.charAt(i);
			if (temp >= '0' && temp <= '9') arr.add(Character.getNumericValue((char)temp));
		}
		
		int answer = 0;
        
        for (int i = 0; i < arr.size(); i++) {
            answer += arr.get(i);
        }
        
        return answer;
    }
}