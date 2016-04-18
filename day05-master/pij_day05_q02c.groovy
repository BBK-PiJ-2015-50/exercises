print "Enter number of Hanoi discs: "
int n = Integer.parseInt(System.console().readLine())
println "for " + n + " discs the number of moves = " + hanoiMoves(n)

// Number of moves to move n discs can be seen to be...
// the number of moves to move n-1 discs from 1st post to middle
// + 1 move: to move disc n to the last post
// + number of moves to move n-1 discs again (from middle to last post)

int hanoiMoves(int n) {
	int result
	if (n == 0) {
		return result
	} else {
	    result = 2 * hanoiMoves(n-1) + 1
	}
}
