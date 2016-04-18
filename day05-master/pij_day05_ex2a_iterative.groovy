println ""
println "FACTORIAL CALCULATOR to calculate n!"
print "Please enter value of n: "
int n = Integer.parseInt(System.console().readLine())
println n + "! = " + calculateFactorial(n)

int calculateFactorial(int n){
  int result=n
  for (i=1;i<(n-1);i++) {
    result=result*(n-i)
  }
  return result
}
