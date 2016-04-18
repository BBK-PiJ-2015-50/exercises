int howmany = -1
int num = 1
while (num != 0) {
	howmany++
	println "Enter a number (end with 0)"
	num = Integer.parseInt(System.console().readLine())
	}
println "You have entered " + howmany + " numbers"