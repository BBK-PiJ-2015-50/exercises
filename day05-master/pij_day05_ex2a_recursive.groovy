println ""
println "FACTORIAL CALCULATOR to calculate n!"
print "Please enter value of n: "
int n = Integer.parseInt(System.console().readLine())
println n + "! = " + calculateFactorial(n)

int calculateFactorial(int n){
  if (n==1) {
    return 1
  } else {
    int result = n * calculateFactorial(n-1)
    return result
  }
}
