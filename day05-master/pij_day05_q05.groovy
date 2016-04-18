class Power {
	static int pow (int base, int exponent) {
		if (exponent == 0) {
			return 1
		} else {
			return base * pow (base, exponent - 1)
		}
	}
	static int powIterative (int base, int exponent) {
		int result = 1
		for (int i = 0; i < exponent; i++) {
			result = base * result
		}
		return result
	}
}

println ("Power calculation (integers only)")
print ("Enter base: ")
int base = Integer.parseInt(System.console().readLine())
print ("Enter exponent: ")
int exponent = Integer.parseInt(System.console().readLine())
println ("Result using recursive method = " + Power.pow(base, exponent))
println ("Result using iterative method = " + Power.powIterative(base, exponent))