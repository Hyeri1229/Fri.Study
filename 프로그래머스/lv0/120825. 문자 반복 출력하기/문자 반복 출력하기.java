class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] ch = new char[my_string.length()];
        
        // ch 배열에 String 한글자씩 넣기
        for (int i = 0; i < my_string.length(); i++) {
            ch[i] = my_string.charAt(i);
        }
        
        // ch 배열의 인덱스를 n번만큼 answer에 누적
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < n; j++) {
                answer += ch[i];
            }
        }
        
        return answer;
    }
}