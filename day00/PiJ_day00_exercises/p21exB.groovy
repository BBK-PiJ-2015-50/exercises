int manwage, wifewage, totalwage
String userinput
print "what does the man earn? "
userinput = System.console().readLine()
manwage = Integer.parseInt(userinput)
print "what does the woman earn? "
userinput = System.console().readLine()
wifewage = Integer.parseInt(userinput)
totalwage = manwage + wifewage
if (totalwage > 40000) {
	println "wow you're quite rich"
} else {
	println "ooh - that's not very much!"
}
