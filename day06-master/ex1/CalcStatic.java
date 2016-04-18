public class CalcStatic {
	public static void add(int a, int b) {
		System.out.println (a+b);
	}
	public static void subtract(int a, int b) {
		System.out.println (a-b);
	}
	public static void multiply(int a, int b){
		System.out.println (a*b);
	}
	public static void divide(int a, int b){
		double x = (double) a;
		double y = (double) b;
		System.out.println (x/y);
	}
	public static void modulus(int a, int b) {
		System.out.println (a%b);
	}	
}