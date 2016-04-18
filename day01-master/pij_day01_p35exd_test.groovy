// print "Enter a number: "
// int i = Integer.parseInt(System.console().readLine())
// String s = (i > 5)? "Greater than 5" : "Not greater than 5"
// println s

	String keyentry
	int num
	int zerocount = 10
	println "Enter a number: "
	keyentry = System.console().readLine()
	num = Integer.parseInt(keyentry)
	// number check
	zerocount = (num == 0)? zerocount+1 : zerocount-1
	println zerocount
// 	num = Integer.parseInt(str)
// 	int i = Integer.parseInt(str)
	// if (i<0) {
	// 	negcount++
	// } else if (i>0) {
	// 	poscount++
	// } else {
	// 	zerocount++
	// }
// }
// print "There were "
// print negcount + " negative numbers, "
// print poscount + " positive numbers "
// println "and " + zerocount + " zeroes"