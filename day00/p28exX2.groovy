boolean finished = false
print "Enter a number (0 to finish): "
String s = System.console().readLine()
int num = Integer.parseInt(s)
int m = num
if (num == 0) {
		finished = true
}
while(!finished) {
	print "Enter another number (0 to finish): "
	s = System.console().readLine()
	num = Integer.parseInt(s)
	if (num != 0) {
		if (num > m) {
			m = num
		}
	} else {
		finished = true
	}
}
println m