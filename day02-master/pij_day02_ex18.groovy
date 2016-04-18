println ""
println "PI CALCULATOR"
println ""
double nextTerm, piCalc
boolean nomore = false
while (!nomore) {
	print "Enter the number of terms for the Pi calculation: "
	n = Integer.parseInt(System.console().readLine())
	int i = 0
	piCalc = 0
	while (i<n) {
		nextTerm = 4 / (2 * i + 1)
		if ((i % 2) == 1) {
			piCalc = piCalc - nextTerm
		} else {
			piCalc = piCalc + nextTerm
		}
		i++
	}
	println ""
	println "With " + n + " terms the Pi calculation = " + piCalc
	println ""
	println "Enter 0 to stop or 1 to try more numbers"
	stop = Integer.parseInt(System.console().readLine())
	if (stop == 0) {
		break
	}
}