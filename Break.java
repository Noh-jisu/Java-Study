
public class Break {

	public static void main(String[] args) {
		
		
		// break를 사용하여 홀수값의 합과 원하는 값을 구하기.
		
		/* 자연수 1부터 시작해서 모든 홀수값을 더하는데, 그 값이 몇번더해야 1000을 넘어가며,
	                더한 값이 1000이 넘는 가장 작은수는 얼마인지 구하는 프로그램.(break사용)*/
		int num = 1;
		int sum = 0;
		
		while (true) {
			if ((num%2) == 1)
				sum += num;
			
			if (sum > 1000) {
				System.out.println(num + "을 더했을 때 1000이 넘음");
				System.out.println("1000을 넘는값 : " + sum);
				break;
			}
			
			num++;
		}
		

	}

}
