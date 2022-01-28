package teamNew;

public class GCD_LCM {
/*	
	https://programmers.co.kr/learn/courses/30/lessons/12940
*/
	//최대공약수 (greatest common divisor) 
	int gcd(int big, int small) {
		if (big % small == 0) {
			return small;
		}
		return gcd(small, big%small);
	}
	
	
	public int[] solution(int n, int m) {
        int[] answer = {};
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        
        answer = new int[2];
        answer[0] = gcd(max, min);
        answer[1] = max * min / answer[0];
        
        return answer;
    }
	
}
