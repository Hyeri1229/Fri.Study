class Solution {
    public int solution(int n) {
        int pizza = 1;
        int slice = 6;
        
        for (int i = 0; i < n; i++) {
			if (slice%n == 0) break;
			pizza++;
			slice += 6;
		}
        
        return pizza;
    }
}