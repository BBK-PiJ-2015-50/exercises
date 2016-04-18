println "Please choose an option: a,b or c"
String str
char choice
boolean finished = false
while (!finished == true) {
	finished = true
	str = System.console().readLine()
	choice = str.charAt(0)
	switch (choice) {
	case 'a':
		println "Choice: " + choice + " - case a"
		break
	case 'b':
		println "Choice: " + choice + " - case b"
		break
	case 'c':
		println "Choice: " + choice + " - case c"
		break
	default:
		println "That is not a valid option, please try again"
		finished = false
		break
	}

}