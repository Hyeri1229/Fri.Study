import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// n과 숫자 입력받기
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		// 배열에 숫자 입력
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int height = 0;
		int max = 0;
		
		// 배열의 다음 인덱스 요소와 비교해서
		// 뒷 숫자가 더 크면 두 수의 차이를 height에 누적
		// 누적된 숫자를 max와 비교해서 더 큰 수를 max에 저장
		// 뒷 숫자가 더 작으면 height 0으로 초기화
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i] < arr[i+1]) {
				height += (arr[i+1] - arr[i]);
			}
			if (height > max) max = height;
			if(arr[i] >= arr[i+1]) height = 0;
			
		}
		System.out.println(max);
		
		sc.close();
	}

}
