int num1, num2
print "1st number > "
answer = System.console().readLine()
num1 = Integer.parseInt(answer)
print "2nd number > "
answer = System.console().readLine()
num2 = Integer.parseInt(answer)
if (num2 == 0) {
	while (num2 == 0) {
		print "NO! Don't enter zero! Try again > "
		answer = System.console().readLine()
		num2 = Integer.parseInt(answer)
}
}
if (num1 % num2 == 0) {
	println "Yes"
} else {
	println "No"
}
