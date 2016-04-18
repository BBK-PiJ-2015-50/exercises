println "Please enter a series of positive numbers"
println "This program will find the highest"
int num
int highest = 0
while(num != -1) {
	print "Please enter a number (-1 to end sequence): "
	num = Integer.parseInt(System.console().readLine())
	if (num > highest) {
		highest = num
	}
}
println ""
println highest + " was the highest number entered"
println ""