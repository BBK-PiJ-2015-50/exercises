String s
print "type in 1st positive number: "
s = System.console().readLine()
a = Integer.parseInt(s)
print "type in 2nd positive number: "
s = System.console().readLine()
b = Integer.parseInt(s)
int quotient = 0
int remainder = a
while (remainder >= b) {	
	remainder = remainder - b	
	quotient = quotient + 1
}
println a + " divided by " + b + " = " + quotient + ", remainder " + remainder
