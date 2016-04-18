print "enter number: "
int num = Integer.parseInt(System.console().readLine())
int previous = num
while (num != 0) {
	print "enter another number: "
	num = Integer.parseInt(System.console().readLine())
	if (num == previous) {
		println "same"
	} else if (num > previous) {
		println "up"
	} else {
		println "down"
	}
	previous = num
}
println "end"