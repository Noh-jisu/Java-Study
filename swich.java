
public class swich {

	public static void main(String[] args) {
		
		// switch ���ǹ�.
		int b = -6;
		
		switch(b) {
		case 1 : 
			System.out.println("�ȳ��ϼ���."); // b�� 1�� ��쿡 ������ ���۵Ǵ°�.
			
		case 2 : 
			System.out.println("�ݰ����ϴ�."); // b�� 2�� ��쿡 ������ ���۵Ǵ°�.(case1�� ����x)
			
		case 3 : 
			System.out.println("���� ��������� �մϴ�."); // b�� 3�ϰ�쿡 ������ ���۵Ǵ°�.(case1, case2�� ����x)
			
		default : 
			System.out.println("������ �ߺ�Ź �帳�ϴ�."); // b�� 1, 2, 3�� ������ ������ ���� ���� ��쿡 ������ ���۵Ǵ°�(case1, case2, case3�� ����x)
				}

	}

}
