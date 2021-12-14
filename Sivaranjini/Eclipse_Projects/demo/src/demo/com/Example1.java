package demo.com;

public class Example1 {

	public static void main(String[] args) {
		int a=1;
		while(a<100) {
			if(a%5==0) {
				
				a++;
				System.out.println("*");
				
				continue;
			}
			System.out.println(a);
			a++;
		}
		
		

	}

}
