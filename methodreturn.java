
public class methodreturn {

	final static double PI = 3.141592;
	
	public static void main(String[] args) {

		//�޼ҵ� ȣ�� �� returnȰ��.
		
		/*���ڷ� ���� ������ ������ ���� ��, ���� ���̸� ����ؼ� ��ȯ�ϴ� �޼ҵ��
		    ���� �ѷ��� ����ؼ� ��Ȳ�ϴ� �޼ҵ带 �����ϰ�, �� ���� ȣ���ϴ� main�޼ҵ带 �����ϱ�.*/
		
		double result;
		result = pirr(4);
		System.out.println("���� ���� : " + result);
		System.out.println("���� �ѷ� : " + pi2r(4));
		
		
	}
		
	public static double pirr(int r) {
		double pirrResult = r*r*PI;
		return pirrResult;
	}
	
	public static double pi2r(int r) {
		return 2*r*PI;
	}


}
