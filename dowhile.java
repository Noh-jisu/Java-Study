
public class dowhile {

	public static void main(String[] args) {
		
		// while�ݺ����� do~while�ݺ���.
		
		// 1���� 100������ ���� ����ϴ� ���α׷�.
		
		//1. while�ݺ����� Ȱ��.
		
		int a = 1;
		int b = 100;
		
		while(a <= 100) {
			System.out.println(a);
			a++;
		}
		
		
	    while(b > 0) {
		    System.out.println(b);
		    b--;
		 }

	    //2. do~while�ݺ����� Ȱ��.
	    
	    do {
	    	System.out.println(a);
	    	a++;
	    } while(a <= 100);
	    
	    do {
	    	System.out.println(b);
	    	b--;
	    } while(b > 0);
	}

}
