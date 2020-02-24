
public class While {

	public static void main(String[] args) {
		
		// while 반복문.
		
		// while반복문을 활용한 1부터 99까지의 합을 구하는 프로그램.
		int num = 1;
		int sum = 0;
		
		while (num < 100) {
			sum += num;
			num++;
		}
		System.out.println("1부터 99까지의 합은 " + sum + "입니다." + '\n');

		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		/* while반복문을 활용한 1000보다 작은 자연수 중에서 2와 7의 공배수를 구하고
		       그 합을 출력하는 프로그램.(if조건문 활용) */
		int a = 1;
		int plus = 0;
		
		while(a <= 1000) {
			if(((a%2) == 0) && ((a%7) == 0)) {
				plus += a;
				System.out.println(a);
			}
		    a++;
		}
		System.out.println("2와 7의 공배수들의 합 : " + plus);
		
	}

}
