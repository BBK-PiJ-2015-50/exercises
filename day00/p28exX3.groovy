int counter = 0
boolean finished = false
while(!finished) {
	print "enter another number "
	String entry = System.console()readLine()
	num = Integer.parseInt(entry)
	if (num != 0) {
		if (num == 100)
			counter = counter + 1
		} else {
			finished = true
		}
}
println "number of 100s = " + counter