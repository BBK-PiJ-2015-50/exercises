public class MatrixChecker {
	
	public boolean isSymmetrical(int[] arrayToCheck) {
		for (int i=0;i<arrayToCheck.length/2;i++) {
			if (arrayToCheck[i] != arrayToCheck[arrayToCheck.length-i-1]) {
				return false;
			}
		}
		return true;
	}

	public boolean isSymmetrical(int[][] arrayToCheck) {
		for (int i=0;i<arrayToCheck.length;i++) {
			for (int j=0;j<arrayToCheck[0].length;j++) {
				if (arrayToCheck[i][j] != arrayToCheck[j][i]) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean isTriangular(int[][] arrayToCheck) {
		for (int i=0;i<arrayToCheck.length;i++) {
			for (int j=0;j<arrayToCheck[0].length;j++) {
				if (arrayToCheck[i][j] != 0 && i > j) {
					return false;
				}
			}
		}
		return true;
	}
}