String str
int negcount = 0
int poscount = 0
int zerocount = 0
boolean finished = false
while (!finished) {
	print "Enter a number: "
	str = System.console().readLine()
	// number check
	if (str >= "A" || str.substring(0,1) == " ") {
		println str + " is not a number"
		break
	}
	int i = Integer.parseInt(str)
	if (i<0) {
		negcount++
	} else if (i>0) {
		poscount++
	} else {
		zerocount++
	}
}
print "There were "
print negcount + " negative numbers, "
print poscount + " positive numbers "
println "and " + zerocount + " zeroes"