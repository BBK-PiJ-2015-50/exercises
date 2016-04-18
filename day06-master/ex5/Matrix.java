public class Matrix {
	private int[][] matrix;
	
	public Matrix(int a, int b) {
		matrix = new int[a][b];
		for (int i=0; i < a; i++) {
			for (int j=0; j < b; j++) {
				matrix[i][j] = 1;
			}
		}
	}
	
	public void setElement(int a, int b, int value) {
		if (a < matrix.length && b < matrix[0].length) {
			matrix[a][b] = value;
		}
	}
	
	
	public void setRow(int a, String s) {
		String[] numbers = s.split(",");	
		if (a < matrix.length && numbers.length == matrix[0].length) {
			for (int i = 0;i < numbers.length;i++) {
				matrix[a][i] = Integer.parseInt(numbers[i]);
			}
		}
	}
	
	public void setColumn(int b, String s) {
		String[] numbers = s.split(",");	
		if (b < matrix[0].length && numbers.length == matrix.length) {
			for (int i = 0;i < numbers.length;i++) {
				matrix[i][b] = Integer.parseInt(numbers[i]);
			}
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				sb.append(matrix[i][j]);
				if (i == (matrix.length - 1) && j == (matrix[0].length - 1)) {
					sb.append("]");
				}
				else if (j < (matrix[0].length - 1)) {
					sb.append(",");
				}
				else {
					sb.append(";");
				}
			}
		}
		return sb.toString();
	}
	
	public void prettyPrint() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				sb.append(matrix[i][j]);
				if (j < matrix[0].length - 1) {
					sb.append("\t");
				}
				else if (i != (matrix.length - 1)) {
					sb.append("\n");
				}
			}
		}
		System.out.println(sb);
	}

	public boolean checkSymmetrical() {
		MatrixChecker check = new MatrixChecker();
		return check.isSymmetrical(matrix);
	}

	public boolean checkTriangular() {
		MatrixChecker check = new MatrixChecker();
		return check.isTriangular(matrix);
	}
}





















