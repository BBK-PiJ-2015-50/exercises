println ""
println "Please enter a possible palindrome to check"
String word = System.console().readLine()
boolean palindrome = true
for (int i=0;i<word.length()/2;i++) {
	if (word.charAt(i) != word.charAt(word.length()-i-1)) {
		palindrome = false
		break
	}
}
println ((palindrome) ? ("Yes - " + word + " is a palindrome") : ("No - " + word + " is not a palindrome"))