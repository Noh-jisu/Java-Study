
public class dowhile {

	public static void main(String[] args) {
		
		// while반복문과 do~while반복문.
		
		// 1부터 100까지의 수를 출력하는 프로그램.
		
		//1. while반복문의 활용.
		
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

	    //2. do~while반복문을 활용.
	    
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
