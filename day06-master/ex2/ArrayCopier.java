public class ArrayCopier {

	int[] copy(int[] srcArray, int[] dstArray) {
		int srcSize = srcArray.length;
		int dstSize = dstArray.length;
		if (srcSize>=dstSize) {
			for(int i=0;i<dstSize;i++) {
				dstArray[i]=srcArray[i];
			}
		}
		else {
			for (int i=0;i<dstSize;i++) {
				dstArray[i] = (i<srcSize) ? srcArray[i] : 0;
			}
		}
		return dstArray;
	}
}