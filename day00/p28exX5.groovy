boolean finished = false
print "enter number: "
String s = System.console().readLine()
int num = Integer.parseInt(s)
int previous = num
while (!finished) {
	print "enter another number: "
	s = System.console().readLine()
	num = Integer.parseInt(s)
	if (num != 0) {
		if (num == previous) {
			println "same"
		} else if (num > previous) {
			println "up"
		} else {
			println "down"
		}
	previous = num
}
}
finished = true
println "end"