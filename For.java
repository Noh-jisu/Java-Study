
public class For {

	public static void main(String[] args) {
		
		// for 반복문
		
		// for반복문을 활용한 구구단 5단을 출력하는 프로그램.
		for(int a = 1; a < 10; a++)
			System.out.println("5x" + a + "=" + a*5);
		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		System.out.println("");
		
	    //ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		// for반복문을 활용한 1부터 10까지 곱한 값을 출력하는 프로그램.
		int mul = 1;
		
		for(int b = 1; b <= 10; b++)
			mul *=b;
		System.out.println("1부터 10까지 곱한 값은 " + mul + "입니다.");

	}

}
