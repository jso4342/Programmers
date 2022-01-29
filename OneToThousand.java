package teamNew;

/*
 * 예로, 10~15까지의 각 숫자 분해하여 곱하기의 전체 합은 다음과 같다.

10 = 1 * 0 = 0
11 = 1 * 1 = 1
12 = 1 * 2 = 2
13 = 1 * 3 = 3
14 = 1 * 4 = 4
15 = 1 * 5 = 5

그러므로, 이 경우의 답은 0+1+2+3+4+5 = 15
 */
public class OneToThousand {
	
	public static void main(String[] args) {
		
		String[] i_array = new String[991]; 
		int sum = 0;
		int integer = 0;
		int num = 0;
		
		for (int i = 10 ; i < 1001 ; i++) {
			int k = 0;
			num = 0;
			i_array[k] = Integer.toString(i);
			for (int count = 0 ; count <i_array[k].length(); count++) {
				integer = (int)i_array[k].charAt(count) - 48;
				if (count == 0) {num = integer;}
				else
					num = num * integer;
				}
			sum = sum + num;
			}
		}
	
	}

