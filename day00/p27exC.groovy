int howmany = 0
boolean finished = false
while (!finished)
{
	println "Enter a number (end with 0)"
	keyentry = System.console().readLine()
	int num = Integer.parseInt(keyentry)
	if (num != 0)
	{
		howmany = howmany + 1
	}
	else
	{
		finished = true
	}
}
println "You have entered " + howmany + "numbers"