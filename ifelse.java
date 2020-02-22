
public class ifelse {

	public static void main(String[] args) {
		
		// if~ else~ 조건문.
		int a = 3; // a는 정수.
	
		if (a < 0) 
			System.out.println("a는 음수입니다."); // a가 0보다 작을경우에 출력되는 값.
		
		else if (a == 0) 
			System.out.println("a는 0입니다."); // a가 0일 경우에 출력되는 값.
		
		else if ((a % 2) == 0) 
			System.out.println("a는 짝수입니다."); // a가 0을 초과하면서 2로 나눈 나머지가 0일 경우에 출력되는 값.
		
		else 
			System.out.println("a는 홀수입니다."); // 위 세가지 조건을 모두 만족하지 못할때 출력되는 값.
	

	}

}
