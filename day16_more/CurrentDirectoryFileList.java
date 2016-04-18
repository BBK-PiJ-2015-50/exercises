import java.io.*;
import java.util.Arrays;

public class CurrentDirectoryFileList {

	public static void main(String[] args) {
	 	CurrentDirectoryFileList fileList = new CurrentDirectoryFileList();
		fileList.launch();
	}
	
	public void launch() {
		File dir = new File(System.getProperty("user.dir"));
		System.out.println(Arrays.toString(dir.listFiles()));
	}
}
