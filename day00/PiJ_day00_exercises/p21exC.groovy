int mark
print "what is your mark? "
answer = System.console().readLine()
mark = Integer.parseInt(answer)
if (mark >= 70) {
	println "great - super!"
} else if (mark >= 50) {
	println "not bad"
} else {
	println "oh dear"
}