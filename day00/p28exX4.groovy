String str = "."
int longestLength = 0
while(str.length() > 0) {
	print "Enter a line of text, blank line to end: "
	str = System.console().readLine()
	if (str.length() > longestLength) {
		longestLength = str.length()
		longestLine = str
	}
}
print "\"" + longestLine + "\" was the longest line. It was "
println longestLength + " characters long."