int manwage, wifewage, totalwage
String userinput
print "what does the man earn? "
manwage = Integer.parseInt(System.console().readLine())
print "what does the woman earn? "
wifewage = Integer.parseInt(System.console().readLine())
totalwage = manwage + wifewage
if (totalwage > 40000) {
	println "wow you're quite rich"
} else {
	println "ooh - that's not very much!"
}
