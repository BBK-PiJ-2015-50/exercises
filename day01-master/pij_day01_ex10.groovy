println "Please enter a series of positive numbers"
println "This program will check if they are consecutive"
println "enter -1 to end sequence"
boolean test = true
print "Please enter the 1st number: "
previous = Integer.parseInt(System.console().readLine())
while (previous != -1) {
	print "Please enter another number: "
	num = Integer.parseInt(System.console().readLine())
	if (num == -1) {
		break
	}
	if (!(((num - previous) == 1) || ((previous - num) == 1))) {
		test = false
	}
	previous = num
}
String answer = (test) ? "Yes" : "No"
println ""
println "Were the numbers in the sequence consecutive?"
println "•• " + answer + " ••"
println ""