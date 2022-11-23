import java.util.*;

class Solution {
    public String solution(String letter) {
    	String[] alpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n",
						  "o","p","q","r","s","t","u","v","w","x","y","z"};
		String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....",
				"..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
				"...","-","..-","...-",".--","-..-","-.--","--.."};
		
		
		// map에 [ key:알파벳 / value:모스부호 ] 짝지어서 삽입
		Map<String, String> map = new HashMap();
		for (int i = 0; i < alpha.length; i++) {
			map.put(alpha[i], morse[i]);
		}
		
		String answer = "";
		
		// 주어진 letter은 공백 기준으로 나눠서 String 배열에 담음
		String[] letters = letter.split(" ");

		// 각 모스부호를 key와 비교해서 같은 것이 있으면 answer에 누적
		for (int i = 0; i < letters.length; i++) {
			for (String key : map.keySet()) {
				if (letters[i].equals(map.get(key))) {
					answer += key;
				}
			}
		}
        
        return answer;
    }
}