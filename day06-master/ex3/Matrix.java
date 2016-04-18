public class Matrix {
	private int[][] matrix;
	private final int a;
	private final int b;
	
	public Matrix(int a, int b) {
		matrix = new int[a][b];
		this.a = a;
		this.b = b;
		for(int i=0; i < a; i++) {
			for(int j=0; j < b; j++) {
				matrix[i][j] = 1;
			}
		}
	}
	
	public void setElement(int a, int b, int set) {
		if(a>this.a||b>this.b) {
			System.out.println ("invalid indices");
			return;
		}
		matrix[a][b] = set;
	}
	
	public void setRow(int a, String s) {
		String[] numList = s.split(",");	
		if(a>this.a || numList.length>this.b) {
			System.out.println ("invalid indices");
			return;
		}
		for(int i = 0; i < numList.length; i++) {
			String num = numList[i];
			matrix[a][i] = Integer.parseInt(num);
		}
	}
	
	public void setColumn(int b, String s) {
		String[] numList = s.split(",");
		if(numList.length>this.a || b>this.b) {
			System.out.println ("invalid indices");
			return;
		}
		for(int i = 0; i < numList.length; i++) {
			String num = numList[i];
			matrix[i][b] = Integer.parseInt(num);
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				sb.append(matrix[i][j]);
				if(i==a-1 && j==b-1)
					sb.append("]");
				else if (j < b-1)
					sb.append(",");
				else
					sb.append(";");
			}
		}
		return sb.toString();
	}
	
	public void prettyPrint() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				sb.append(matrix[i][j]);
				if (j < b-1)
					sb.append("\t");
				else
					sb.append("\n");
			}
		}
		System.out.print(sb);
	}
}





















