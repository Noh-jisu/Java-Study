
public class methodreturn {

	final static double PI = 3.141592;
	
	public static void main(String[] args) {

		//메소드 호출 및 return활용.
		
		/*인자로 원의 반지름 정보를 전달 시, 원의 넓이를 계산해서 반환하는 메소드와
		    원의 둘레를 계산해서 반황하는 메소드를 정의하고, 이 둘을 호출하는 main메소드를 정의하기.*/
		
		double result;
		result = pirr(4);
		System.out.println("원의 넓이 : " + result);
		System.out.println("원의 둘레 : " + pi2r(4));
		
		
	}
		
	public static double pirr(int r) {
		double pirrResult = r*r*PI;
		return pirrResult;
	}
	
	public static double pi2r(int r) {
		return 2*r*PI;
	}


}
