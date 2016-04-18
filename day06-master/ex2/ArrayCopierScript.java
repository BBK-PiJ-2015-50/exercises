public class ArrayCopierScript {

	public static void main (String[] args) {
		ArrayCopierScript copyScript = new ArrayCopierScript();
		copyScript.launch();
	}

	private void launch() {
		int[] dst = new int[9];
		int[] src1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		int[] src2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] src3 = {1, 2, 3, 4, 5};
		System.out.println("");
		System.out.println("source array bigger than destination");
		CopyTest(src1, dst);
		System.out.println("source array same size as destination");
		CopyTest(src2, dst);
		System.out.println("source array smaller than destination");
		CopyTest(src3, dst);
	}

	private void CopyTest(int[] src, int[] dst) {
		ArrayCopier Copier = new ArrayCopier();
		int[] newArray = Copier.copy(src,dst);
		for(int i = 0; i < newArray.length; i++) {
			System.out.println (newArray[i]);
		}
	}
}