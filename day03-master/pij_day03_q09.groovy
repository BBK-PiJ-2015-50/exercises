println ""
println "* Palindrome Creator Program *"
println "Enter some text"
String text = System.console().readLine()
int textLength = text.length()
print text
for (int i=textLength-1;i>=0;i--) {
	print text.charAt(i)
}
println ()