import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int five = 1;	// 5kg 봉지개수
		int three = 0;	// 3kg 봉지개수 
		int count = 0;	// 봉지개수 
		int min = 0;	// 최소 봉지개수 
		
		// 1. 5kg 봉지로 나누고, 남은 양이 3의 배수일때 
		// 총 봉지개수는 5키로+3키로 봉지개수 
		// 5키로 봉지로 담은 양이 총량을 넘어서기 전까지 반복 
		while (n-(5*five) >= 0) {
			if((n-(5*five))%3 == 0) {
				count = five + (n-(5*five))/3;
				if(min == 0) min = count;
				else if (count < min) min = count;
			}
			five++;
		}
		
		// 2. n이 3의 배수일때, 3키로 봉지에 담았을 때의 개수와
		// 5키로와 3키로 봉지로 나누어 담았을 때의 개수를 비교해서 작은 것 카운트 
		if(n%3 == 0) {
			three = n/3;
			if(min == 0) min = three;
			else if (three < min) min = three;
		}
		
		// 1,2 두가지 경우 모두 아닐 경우 -1 출력 
		if (min == 0) min = -1;
		
		System.out.println(min);



	}

}
