println "Line to Words On Lines"
println "Please enter a line of text"
String text = System.console().readLine()
int startOfSubstring = 0
for (int i=0;i<text.length();i++) {
	if ((text.charAt(i) == " ") || (i == (text.length() - 1))) {
		println (text.substring(startOfSubstring, i+1))
		startOfSubstring = i + 1
	}
}
