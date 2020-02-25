
public class forwhile {

	public static void main(String[] args) {
		
		//반복문의 중첩(for~for~)
		/* 구구단의 짝수 단인 2, 4, 5, 8단만 출력하는 프로그램을 작성하는데
		   2단은 2x2까지, 4단은 4x4까지, 6단은 6x6까지, 8단은 8x8까지 출력하기.
		 */
				
		// for문의 중첩 사용
		for(int a = 1; a < 10; a++) {
			for (int b = 1; b < 10; b++) {
				if(((a%2) == 0) && (a >= b))
					System.out.println(a + "x" + b + "=" + a*b);
			}
			
		}
		
		
		// while문의 중첩 사용
		
		int i = 1;
		int j;
		
		while(i < 10) {
			j = 1;  
			//while문 안에 j라는 변수를 1로 지정해주지 않으면 다음 while문에서 j가 10보다 같거나 커지므로 반복불가. 
			while(j < 10) {
				if(((i%2) == 0 ) && (i >= j))
					System.out.println(i + "x" + j + "=" + i*j);
				j++;
			}
			i++;
		}
		
		//for문과 while문의 중첩 사용
		
		int num2;
		
		for(int num1 = 1; num1 < 10; num1++) {
			 num2 = 1;
			while(num2 < 10) {
				if(((num1 % 2) == 0 ) && (num1 >= num2))
					System.out.println(num1 + "x" + num2 + "=" + num1*num2);
				num2++;
			}
		}

	}

}
