
public class Break {

	public static void main(String[] args) {
		
		
		// break�� ����Ͽ� Ȧ������ �հ� ���ϴ� ���� ���ϱ�.
		
		/* �ڿ��� 1���� �����ؼ� ��� Ȧ������ ���ϴµ�, �� ���� ������ؾ� 1000�� �Ѿ��,
	                ���� ���� 1000�� �Ѵ� ���� �������� ������ ���ϴ� ���α׷�.(break���)*/
		int num = 1;
		int sum = 0;
		
		while (true) {
			if ((num%2) == 1)
				sum += num;
			
			if (sum > 1000) {
				System.out.println(num + "�� ������ �� 1000�� ����");
				System.out.println("1000�� �Ѵ°� : " + sum);
				break;
			}
			
			num++;
		}
		

	}

}
