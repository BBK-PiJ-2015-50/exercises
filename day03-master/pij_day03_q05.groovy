println ""
println "* Counting Letters Program *"
println "Please enter a line of text"
String text = System.console().readLine()
println "Please choose a letter to count in the text"
char chosenLetter = System.console().readLine().charAt(0)
int chosenLetterCount = 0
for (int i=0;i<text.length();i++) {
	if (text.charAt(i) == chosenLetter) {
		chosenLetterCount++
	}
}
println ("The letter " + chosenLetter + " appears " + chosenLetterCount + " times in the text")