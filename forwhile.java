
public class forwhile {

	public static void main(String[] args) {
		
		//�ݺ����� ��ø(for~for~)
		/* �������� ¦�� ���� 2, 4, 5, 8�ܸ� ����ϴ� ���α׷��� �ۼ��ϴµ�
		   2���� 2x2����, 4���� 4x4����, 6���� 6x6����, 8���� 8x8���� ����ϱ�.
		 */
				
		// for���� ��ø ���
		for(int a = 1; a < 10; a++) {
			for (int b = 1; b < 10; b++) {
				if(((a%2) == 0) && (a >= b))
					System.out.println(a + "x" + b + "=" + a*b);
			}
			
		}
		
		
		// while���� ��ø ���
		
		int i = 1;
		int j;
		
		while(i < 10) {
			j = 1;  
			//while�� �ȿ� j��� ������ 1�� ���������� ������ ���� while������ j�� 10���� ���ų� Ŀ���Ƿ� �ݺ��Ұ�. 
			while(j < 10) {
				if(((i%2) == 0 ) && (i >= j))
					System.out.println(i + "x" + j + "=" + i*j);
				j++;
			}
			i++;
		}
		
		//for���� while���� ��ø ���
		
		int num2;
		
		for(int num1 = 1; num1 < 10; num1++) {
			 num2 = 1;
			while(num2 < 10) {
				if(((num1 % 2) == 0 ) && (num1 >= num2))
					System.out.println(num1 + "x" + num2 + "=" + num1*num2);
				num2++;
			}
		}

	}

}
