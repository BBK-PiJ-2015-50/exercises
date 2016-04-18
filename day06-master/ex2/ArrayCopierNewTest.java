import java.util.Arrays;

public class ArrayCopierNewTest {

	public static void main (String[] args) {
		ArrayCopierNewTest script = new ArrayCopierNewTest();
		script.launch();
	}

	private void launch() {
		ArrayCopier copier = new ArrayCopier();
		int[] dst = new int[9];
		int[] src1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		int[] src2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] src3 = {1, 2, 3, 4, 5};
		System.out.println("");
		System.out.println("Printing copied array");
		System.out.println("source array bigger than destination");
		System.out.println(Arrays.toString(copier.copy(src1, dst)));
		System.out.println("source array same size as destination");
		System.out.println(Arrays.toString(copier.copy(src2, dst)));
		System.out.println("source array smaller than destination");
		System.out.println(Arrays.toString(copier.copy(src3, dst)));
	}
}