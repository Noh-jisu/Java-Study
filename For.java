
public class For {

	public static void main(String[] args) {
		
		// for �ݺ���
		
		// for�ݺ����� Ȱ���� ������ 5���� ����ϴ� ���α׷�.
		for(int a = 1; a < 10; a++)
			System.out.println("5x" + a + "=" + a*5);
		
		//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
		System.out.println("");
		
	    //�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
		
		// for�ݺ����� Ȱ���� 1���� 10���� ���� ���� ����ϴ� ���α׷�.
		int mul = 1;
		
		for(int b = 1; b <= 10; b++)
			mul *=b;
		System.out.println("1���� 10���� ���� ���� " + mul + "�Դϴ�.");

	}

}
