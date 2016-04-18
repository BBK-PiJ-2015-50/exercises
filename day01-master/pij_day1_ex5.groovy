String s
print "type in 1st number: "
s = System.console().readLine()
a = Integer.parseInt(s)
print "type in 2nd number: "
s = System.console().readLine()
b = Integer.parseInt(s)
int count = 1
int product = a
while (count != b) {
	product = product + a
	count = count + 1
}
println a + " x " + b + " = " + product
