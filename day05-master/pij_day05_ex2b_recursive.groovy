println ""
println "FIBONACCI CALCULATOR to calculate the nth element"
print "Please enter value of n: "
int n = Integer.parseInt(System.console().readLine())
println n + "th Fibonacci number = " + fibonacciNumber(n)

int fibonacciNumber(int n){
  if ((n==1) || (n==2)) {
    return 1
  } else {
    int result = fibonacciNumber(n-1) + fibonacciNumber(n-2)
    return result
  }
}
