import java.util.Scanner

println ""
println "CHANGE CALCULATOR"
println "Enter values as pounds.pence, eg. 3.50"
int denomination, denominationInPence, quantityOfDenomination
Scanner input = new Scanner(System.in)
print "Enter cost of item: "
double costInPounds = input.nextDouble()
int costInPence = (int)(costInPounds * 100)
print "Enter amount paid: "
double paidInPounds = input.nextDouble()
int paidInPence = (int)(paidInPounds * 100)
int change = paidInPence - costInPence
print "Change = £"
println ((int)(change / 100) + "." + (change % 100))

denomination = 50
denominationInPence = denomination * 100
quantityOfDenomination = (change / denominationInPence)
if (quantityOfDenomination > 0) {
	println (quantityOfDenomination + " x £" + denomination + " note")
}
change = change % (denomination *100)
denomination = 20
denominationInPence = denomination * 100
quantityOfDenomination = (change / denominationInPence)
if (quantityOfDenomination > 0) {
	println (quantityOfDenomination + " x £" + denomination + " note")
}
change = change % (denomination *100)
denomination = 10
denominationInPence = denomination * 100
quantityOfDenomination = (change / denominationInPence)
if (quantityOfDenomination > 0) {
	println (quantityOfDenomination + " x £" + denomination + " note")
}
change = change % (denomination *100)
denomination = 5
denominationInPence = denomination * 100
quantityOfDenomination = (change / denominationInPence)
if (quantityOfDenomination > 0) {
	println (quantityOfDenomination + " x £" + denomination + " note")
}
change = change % (denomination *100)

denomination = 2
denominationInPence = denomination * 100
quantityOfDenomination = (change / denominationInPence)
if (quantityOfDenomination > 0) {
	println (quantityOfDenomination + " x £" + denomination + " coin")
}
change = change % (denomination *100)
denomination = 1
denominationInPence = denomination * 100
quantityOfDenomination = (change / denominationInPence)
if (quantityOfDenomination > 0) {
	println (quantityOfDenomination + " x £" + denomination + " coin")
}
change = change % (denomination *100)

denominationInPence = 50
quantityOfDenomination = (change / denominationInPence)
if (quantityOfDenomination > 0) {
	println (quantityOfDenomination + " x " + denominationInPence + "p")
}
change = change % denominationInPence
denominationInPence = 20
quantityOfDenomination = (change / denominationInPence)
if (quantityOfDenomination > 0) {
	println (quantityOfDenomination + " x " + denominationInPence + "p")
}
change = change % denominationInPence
denominationInPence = 10
quantityOfDenomination = (change / denominationInPence)
if (quantityOfDenomination > 0) {
	println (quantityOfDenomination + " x " + denominationInPence + "p")
}
change = change % denominationInPence
denominationInPence = 5
quantityOfDenomination = (change / denominationInPence)
if (quantityOfDenomination > 0) {
	println (quantityOfDenomination + " x " + denominationInPence + "p")
}
change = change % denominationInPence
denominationInPence = 2
quantityOfDenomination = (change / denominationInPence)
if (quantityOfDenomination > 0) {
	println (quantityOfDenomination + " x " + denominationInPence + "p")
}
change = change % denominationInPence
denominationInPence = 1
quantityOfDenomination = change
if (quantityOfDenomination > 0) {
	println (quantityOfDenomination + " x " + denominationInPence + "p")
}