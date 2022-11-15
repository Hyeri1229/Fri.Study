class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char[] ch = new char[my_string.length()];
        char[] temp = new char[letter.length()];
        
        // String -> char 바꾸려고 배열에 그냥 넣음.. -> 비교하려고!
        for (int i = 0; i < letter.length(); i++){
            temp[i] = letter.charAt(i);
        }
        
        // char 배열 만들어서 String 요소 하나하나 넣음
        for (int i = 0; i < my_string.length(); i++) {
            ch[i] = my_string.charAt(i);
        }
        
        // char 배열 출력 -> temp 배열 요소랑 같으면 출력 안하기!
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == temp[letter.length()-1]) continue;
            else answer += ch[i];    
        }
        return answer;
    }
}