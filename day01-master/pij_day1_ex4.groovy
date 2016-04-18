print "type in a number: "
String s = System.console().readLine()
a = Integer.parseInt(s)
int b = 2
boolean prime = true
if (a == 2) {
	println a + " is a prime number"
} else {
	while (prime) {
		if (a % b == 0) {
			prime = false
			break
		}
		b = b + 1
		if (a == b) {
			prime = true
			println a + " is a prime number"
			break
		}
	}
	if (!prime) {
		println a + " is not a prime number"
	}
}