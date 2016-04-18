void printNumbers(int n) {

	if (n <= 0) {
		println("EXTRA PRINT when n<=0, \t\t\tn = " + n)
		return;
	}
	println("\t\t\t\t\tn = " + n + ", 1ST PRINT");
	printNumbers(n-2);
	println("EXTRA PRINT between (n-2) & (n-3)\tn = " + n)
	printNumbers(n-3);
	println("\t\t\t\t\tn = " + n + ", 2ND PRINT");
}

printNumbers(6)