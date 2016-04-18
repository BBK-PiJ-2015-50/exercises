public class CalculatorScript {

	public static void main (String[] args) {
		CalculatorScript script = new CalculatorScript();
		script.launch();
	}

	private void launch() {
		Calculator Calc = new Calculator();
		Calc.add(223,4343);
		Calc.subtract(511,672);
		Calc.divide(15,31);
		Calc.multiply(23,47);
		Calc.modulus(23,5);
	}
}
