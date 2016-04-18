public class CalcStaticScript {

	public static void main (String[] args) {
		CalcStaticScript script = new CalcStaticScript();
		script.launch();
	}

	private void launch() {
		CalcStatic.add(223,4343);
		CalcStatic.subtract(511,672);
		CalcStatic.divide(15,31);
		CalcStatic.multiply(23,47);
		CalcStatic.modulus(23,5);
	}
}