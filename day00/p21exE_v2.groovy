print "enter a 24hr clock time > "
int time = Integer.parseInt(System.console().readLine())
while (time < 0 || time > 2359 || time % 100 > 59) {
		print "NO! Not a real 24hr time! Try again > "
		time = Integer.parseInt(System.console().readLine())
}
if (time > 0 && time < 1200){
		println "morning"
}
else {
	if (time >= 1200 && time < 1800) {
		println "afternoon"
	}
	else {
		println "evening"
	}
}