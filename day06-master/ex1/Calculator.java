public class Calculator {
	public void add(int a, int b) {
		System.out.println (a+b);
	}
	public void subtract(int a, int b) {
		System.out.println (a-b);
	}
	public void multiply(int a, int b){
		System.out.println (a*b);
	}
	public void divide(int a, int b){
		double x = (double) a;
		double y = (double) b;
		System.out.println (x/y);
	}
	public void modulus(int a, int b) {
		System.out.println (a%b);
	}	
}