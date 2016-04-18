int a, b, quotient, remainder
println "Division: this program will find the quotient & remainder for the 2 numbers you enter"
boolean nomore = false
while (!nomore) {
	print "Please enter 1st number: "
	a = Integer.parseInt(System.console().readLine())
	if (a == 0) {
		println "You entered 0 - so we'll stop there"
		break
	}
	print "Please enter 2nd number: "
	b = Integer.parseInt(System.console().readLine())
	if (b == 0) {
		println "Can't divide by 0"
		break
	}
	quotient = 0
	remainder = a
	while (remainder >= b) {
		remainder = remainder - b
		quotient++
	}
	println a + " divided by " + b + " = " + quotient + ", remainder " + remainder
}