println "Please choose an option: 1,2 or 3"
int choice
boolean finished = false
while (!finished == true) {
	finished = true
	choice = Integer.parseInt(System.console().readLine())
	switch (choice) {
	case 1:
		println "Choice: " + choice + " - case 1"
		break
	case 2:
		println "Choice: " + choice + " - case 2"
		break
	case 3:
		println "Choice: " + choice + " - case 3"
		break
	default:
		println "That is not a valid option, please try again"
		finished = false
		break
	}

}