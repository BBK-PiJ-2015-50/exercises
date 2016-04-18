import java.util.Scanner

// Updated switch block to use enum for operation selection
// Updated user input with Scanner
println ""
println "CALCULATOR PROGRAM...now using Scanner!"
double num1, num2
enum MathematicalOperation {ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION}
MathematicalOperation calc
Scanner input = new Scanner(System.in)
while (true) {
  println ""
  println "Enter 1st number"
  num1 = input.nextDouble()
  println "Enter 2nd number"
  num2 = input.nextDouble()
  println "Choose a mathematical operation..."
  println "ADDITION, SUBTRACTION, MULTIPLICATION or DIVISION"
  calc = MathematicalOperation.valueOf(input.next().toUpperCase())
  switch (calc) {
    case MathematicalOperation.ADDITION:
      println num1 + " + " + num2 + " = " + (num1 + num2)
      break
    case MathematicalOperation.SUBTRACTION:
      println num1 + " - " + num2 + " = " + (num1 - num2)
      break
    case MathematicalOperation.MULTIPLICATION:
      println num1 + " * " + num2 + " = " + (num1 * num2)
      break
    case MathematicalOperation.DIVISION:
      println num1 + " / " + num2 + " = " + (num1 / num2)
      break
    default:
      println "Sorry - not a valid option!"
      break
  }
  println "Enter 0 to stop or 1 to try more numbers"
  stop = input.nextInt()
  if (stop == 0) {
    break
  }
}


	



