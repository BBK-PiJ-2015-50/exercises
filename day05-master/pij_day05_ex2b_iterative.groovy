println ""
println "FIBONACCI CALCULATOR to calculate the nth element"
print "Please enter value of n: "
int n = Integer.parseInt(System.console().readLine())
print "element " + n + " in the Fibonacci sequence = "
println fibonacciNumber(n)

int fibonacciNumber(int n){
  int result
  if ((n==1) || (n==2)) {
    return 1
  } else {
    int oneBack = 1
    int twoBack = 1
    for (int i=2;i<n;i++) {
      result = twoBack + oneBack
      twoBack = oneBack
      oneBack = result
    }
  }
  return result;
}
