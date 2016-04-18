public class Comparator {
private double m, n;

	public int getMax(int m, int n) {
		double d1 = (double) m;
		double d2 = (double) n;
		double dr = getMax(d1, d2);
		int result = (int) dr;
		return result;
	}

	public String getMax(String number1, String number2) {
		double d1 = Double.parseDouble(number1);
		double d2 = Double.parseDouble(number2);
		double dr = getMax(d1, d2);
		String result = Double.toString(dr);
		return result;
	}

	public double getMax(double m, double n) {
		if (n > m) {
			return n;
		} else {
			return m;
		}
	}
	
}