println "Line to Column Program"
println "Please enter a line of text"
String text = System.console().readLine()
for (int i=0;i<text.length();i++) {
	println (text.charAt(i))
}
