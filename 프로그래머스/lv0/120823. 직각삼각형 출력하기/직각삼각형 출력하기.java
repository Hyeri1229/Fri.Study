import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        
        // 정수 n이 입력되면 n번째 줄만큼 반복
        // star 변수를 선언해서 1로 초기화
        // 한 줄씩 증가할때마다 그 줄의 수만큼 별 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < star; j++) {
                System.out.print("*");                
            }
            star++;
            System.out.println(); 
        }
  
    }
}