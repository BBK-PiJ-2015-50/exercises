double d1 = 1.255
double d2 = d1 + 7 - 4 - 3
println("d1 = " + d1)
println("d2 = " + d2)
if (d1 == d2) {
	println("1.255 is equal to 1.255 plus 7 minus 7");
} else {
	println("1.255 is NOT equal to 1.255 plus 7 minus 7");
}
if (Math.abs(d1-d2) < 10E-6) {
	println("But they're pretty close...within 1.0E-6")
}