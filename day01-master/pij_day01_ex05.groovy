int product, i
boolean anegative, bnegative, productnegative
println "This program multiplies 2 integers"
boolean nomore = false
while (!nomore) {
	print "Please enter the 1st number: "
	a = Integer.parseInt(System.console().readLine())
	print "Please enter the 2nd number: "
	b = Integer.parseInt(System.console().readLine())
	if (a == 0 || b == 0) {
		println "Product = 0"
		break
	}
	// negative number checks
	if (a < 0) {
		anegative = true
		a = 0 - a
	} else {
		anegative = false
	}
	if (b < 0) {
		bnegative = true
		b = 0 - b
	} else {
		bnegative = false
	}
	i = 1
	product = a
	while (b > i) {
		product = product + a
		i++
	}
	// correction if just one number is negative
	product = (anegative == bnegative) ? product : 0 - product
	println "Product = " + product
}