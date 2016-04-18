int counter = 0
int num = 1
while(num != 0) {
	print "enter another number "
	num = Integer.parseInt(System.console().readLine())
	if (num == 100) {
		counter++
	}
}
println "number of 100s = " + counter