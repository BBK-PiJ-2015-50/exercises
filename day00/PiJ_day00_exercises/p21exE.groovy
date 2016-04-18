print "enter a 24hr clock time > "
String timeentry = System.console().readLine()
int time = Integer.parseInt(timeentry)
if (time < 0 || time > 2359 || time % 100 > 59)
{
	println "?"
}
else
{
	if (time > 0 && time < 1200)
	{
		println "morning"
	}
	else
	{
		if (time >= 1200 && time < 1800)
		{
			println "afternoon"
		}
		else
		{
			println "evening"
		}
	}
}