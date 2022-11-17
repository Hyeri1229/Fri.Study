import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * X가 3으로 나누어 떨어지면, 3으로 나눈다.
		 * X가 2로 나누어 떨어지면, 2로 나눈다.
		 * 1을 뺀다.
		 * */

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		// 입력 받을 x의 길이만큼의 배열 만들기(인덱스를 x로 사용할거라서 +1 해줌)
		// count 배열에 연산 최소값 저장
		int[] count = new int[x+1];
		// x가 1일 때는 아무 연산도 안하니까 count=0
		count[1] = 0;
		
		for (int i = 2; i < count.length; i++) {
			if (i%6 == 0) {
				// 6으로 나누어 떨어지는 경우
				// 3으로 나누기, 2로 나누기, 1빼기 모두 고려해야함
				count[i] = Math.min(count[i/3], Math.min(count[i/2], count[i-1])) + 1;
			} else if (i%3 == 0) {
				// 3으로만 나누어 떨어지는 경우
				// 3으로 나누기, 1빼기 고려해야함
				count[i] = Math.min(count[i/3], count[i-1]) + 1;
			} else if (i%2 == 0) {
				// 2로만 나누어 떨어지는 경우
				// 2로 나누기, 1빼기 고려해야함
				count[i] = Math.min(count[i/2], count[i-1]) + 1;
			} else {
				// 1빼기만 가능한 경우
				count[i] = count[i-1] + 1;
			}
		}

		System.out.println(count[x]);

	}


}