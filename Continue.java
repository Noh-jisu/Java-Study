
public class Continue {

	public static void main(String[] args) {
		
		/* ���ǹ��� ��ø �� continue�� Ȱ��.
		 * �ڿ��� 1���� �����ؼ� ��� Ȧ������ ���ϴµ�, �� ���� ������ؾ� 1000�� �Ѿ��,
		       ���� ���� 1000�� �Ѵ� ���� �������� ������ ���ϴ� ���α׷�.
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
		System.out.println((count*2)-1 + "�� ���Ҷ� 1000�� �Ѵ´�.");
		System.out.println("�ʰ��� �ּҰ� : "+sum);

	}

}
