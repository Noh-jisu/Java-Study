
public class While {

	public static void main(String[] args) {
		
		// while �ݺ���.
		
		// while�ݺ����� Ȱ���� 1���� 99������ ���� ���ϴ� ���α׷�.
		int num = 1;
		int sum = 0;
		
		while (num < 100) {
			sum += num;
			num++;
		}
		System.out.println("1���� 99������ ���� " + sum + "�Դϴ�." + '\n');

		//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
		
		/* while�ݺ����� Ȱ���� 1000���� ���� �ڿ��� �߿��� 2�� 7�� ������� ���ϰ�
		       �� ���� ����ϴ� ���α׷�.(if���ǹ� Ȱ��) */
		int a = 1;
		int plus = 0;
		
		while(a <= 1000) {
			if(((a%2) == 0) && ((a%7) == 0)) {
				plus += a;
				System.out.println(a);
			}
		    a++;
		}
		System.out.println("2�� 7�� ��������� �� : " + plus);
		
	}

}
