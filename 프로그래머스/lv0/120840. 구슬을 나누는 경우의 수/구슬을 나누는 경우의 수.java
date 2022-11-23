import java.math.BigInteger;

class Solution {
    public BigInteger solution(int balls, int share) {
        BigInteger answer = new BigInteger("0");
		BigInteger n = new BigInteger("1");
		BigInteger m = new BigInteger("1");
		BigInteger x = new BigInteger("1");
		
		// 서로 다른 n(ball)개 중 m(share)개를 뽑는 경우의 수 공식
		// n! / (n-m)! * m!
		
		for (int i = balls; i > 0; i--) { // n!
			n = n.multiply(BigInteger.valueOf(i));
		}
		
		for (int i = share; i > 0; i--) { // m!
			m = m.multiply(BigInteger.valueOf(i));
		}
		
		for (int i = balls-share; i > 0; i--) { // (n-m)!
			x = x.multiply(BigInteger.valueOf(i));
		}
		
		answer = n.divide(x.multiply(m));
		
        return answer;
    }
}