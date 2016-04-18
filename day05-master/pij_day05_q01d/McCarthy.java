public class McCarthy {

	public static void main(String[] args) {
	 	McCarthy script = new McCarthy();
		script.launch();
	}

	public void launch() {

		//int number = McC.mcCarthy91(50);
		System.out.println("\nARGUMENT:50...");
		System.out.println("RESULT FOR ARGUMENT:50..." + mcCarthy91(50));
		System.out.println("\nARGUMENT:73...");
		System.out.println("RESULT FOR ARGUMENT:73..." + mcCarthy91(73));
		System.out.println("\nARGUMENT:95...");
		System.out.println("RESULT FOR ARGUMENT:95..." + mcCarthy91(95));
	}

	private static int mcCarthy91(int n) {
		if (n > 100) {
			System.out.println("n= " + n + "\treturn n-10 = " + (n-10));
			return n - 10;
		} else {
			System.out.println("n= " + n + "\treturn mcCarthy91(mcCarthy91(n+11))...(n+11 = " + (n+11) + ")");
			return mcCarthy91(mcCarthy91(n+11));
		}
	}

	}