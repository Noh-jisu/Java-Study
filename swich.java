
public class swich {

	public static void main(String[] args) {
		
		// switch 조건문.
		int b = -6;
		
		switch(b) {
		case 1 : 
			System.out.println("안녕하세요."); // b가 1일 경우에 실행이 시작되는곳.
			
		case 2 : 
			System.out.println("반갑습니다."); // b가 2일 경우에 실행이 시작되는곳.(case1은 실행x)
			
		case 3 : 
			System.out.println("저는 노지수라고 합니다."); // b가 3일경우에 실행이 시작되는곳.(case1, case2는 실행x)
			
		default : 
			System.out.println("앞으로 잘부탁 드립니다."); // b가 1, 2, 3을 제외한 나머지 수가 오는 경우에 실행이 시작되는곳(case1, case2, case3은 실행x)
				}

	}

}
