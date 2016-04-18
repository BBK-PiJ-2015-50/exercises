println "This program will sort 3 numbers, from low to high"
int swap
boolean finalcomparison
boolean nomore = false
while (!nomore) {
	print "Please enter 1st number: "
	a = Integer.parseInt(System.console().readLine())
	print "Please enter 2nd number: "
	b = Integer.parseInt(System.console().readLine())
	print "Please enter 3rd number: "
	c = Integer.parseInt(System.console().readLine())
	finalcomparison = false
	stillComparing = true
	while (stillComparing) {
		if (b < a) {
			swap = a
			a = b
			b = swap
		}
		if (finalcomparison) {
			break
		}
		if (c < b) {
			swap = b
			b = c
			c = swap
		} else {
			break
		}
		finalcomparison = true
	}
	println "The numbers in order: " + a + ", " + b + ", " + c
	println ""
	println "Enter 0 to stop or 1 to try more numbers"
	stop = Integer.parseInt(System.console().readLine())
	if (stop == 0) {
		break
	}
}
