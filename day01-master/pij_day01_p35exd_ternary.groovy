String str
int negcount = 0
int poscount = 0
int zerocount = 0
boolean finished = false
while (!finished) {
	print "Enter a number: "
	str = System.console().readLine()
	// number check...possibly not perfect
	if (str >= "A" || str.substring(0,1) == " ") {
		println str + " is not a number"
		break
	}
	int i = Integer.parseInt(str)
	zerocount = (i == 0)? zerocount+1 : zerocount
	poscount = (i > 0)? poscount+1 : poscount
	negcount = (i < 0)? negcount+1 : negcount
}
print "There were "
print negcount + " negative numbers, "
print poscount + " positive numbers "
println "and " + zerocount + " zeroes"