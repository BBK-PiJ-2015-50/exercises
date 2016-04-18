println "This is a prime number checker"
boolean nomore = false
while (!nomore) {
	print "Please enter a number: "
	num = Integer.parseInt(System.console().readLine())
	if (num == 0) {
		break
	}
	int i = 2
	boolean finished = false
	if (num == 1) {
		println "No: " + num + " is not a prime number"
		finished = true
	} else if (num == 2) {
		println "Yes: " + num + " is a prime number"
		finished = true
	}
	while (!finished) {
		if ((num % i) == 0) {
			println "No: " + num + " is not a prime number"
			break
		}
		i++
		if (i == num) {
			println "Yes: " + num + " is a prime number"
			finished = true
		}
	}
}