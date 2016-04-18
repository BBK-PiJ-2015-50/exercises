int m
boolean finished = false
boolean firstrun = true
while(!finished)
{
	print "Enter another number (0 to finish): "
	String s = System.console().readLine()
	int num = Integer.parseInt(s)
	if (num != 0)
	{
		if (firstrun)
		{
			m = num
		}
		else
		{
		firstrun = false
			if (num > m)
			{
				m = num
			}
		}
	}
	else
	{
		finished = true
	}
}
println firstrun