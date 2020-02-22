
public class Continue {

	public static void main(String[] args) {
		
		/* 조건문의 중첩 및 continue를 활용.
		 * 자연수 1부터 시작해서 모든 홀수값을 더하는데, 그 값이 몇번더해야 1000을 넘어가며,
		       더한 값이 1000이 넘는 가장 작은수는 얼마인지 구하는 프로그램.
		 */
		int num = 0;
		int count = 0;
		int sum = 0;
		
		while ((num++ >= 0) && (sum <= 1000)) { 
			if((num % 2) != 1) {
				continue;
			}
			count++;
			sum += num;
		}
		System.out.println((count*2)-1 + "번 더할때 1000이 넘는다.");
		System.out.println("초과된 최소값 : "+sum);

	}

}
