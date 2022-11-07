class Solution {
    public int[] solution(int[] num_list) {
        // 주어진 num_list와 같은 길이의 배열 선언
        int[] answer = new int[num_list.length];
        // index 변수를 배열 제일 끝 값의 인덱스로 초기화
        int index = num_list.length-1;
        
        // answer 배열을 num_list 배열의 끝값부터 넣기
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[index];
            index--;
        }
        return answer;
    }
}