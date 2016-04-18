/**
 * Created by chris on 12/22/15.
 */
import java.io.*;
import java.util.Scanner;

public class Cp {

    public static void main(String[] args) {
        Cp cp = new Cp();
        if (args.length == 2) {
            cp.launch(args[0], args[1]);
        }
        else {
            System.out.println("You didn't enter 2 filenames!");
        }
    }

    public void launch(String source, String destination) {
        File sourceFile = new File(source);
        File destinationFile = new File(destination);

        if (destinationFile.exists() && sourceFile.exists()) {
            System.out.print("Overwrite " + destination + " - Y/N?: ");
            if (! new Scanner(System.in).nextLine().toUpperCase().equals("Y")) {
                System.out.println(("OK - file won't be copied"));
            } else {
                BufferedReader in = null;
                PrintWriter out = null;
                try {
                    in = new BufferedReader(new FileReader(sourceFile));
                    out = new PrintWriter(destinationFile);
                    String line;
                    while ((line = in.readLine()) != null) {
                        out.println(line);
                    }
                    System.out.println(source + " copied to " + destination);
                } catch (FileNotFoundException ex) {
                    System.out.println(source + " does not exist!");
                } catch (IOException ex) {
                    ex.printStackTrace();
                } finally {
                    closeReader(in);
                    if (out != null) {
                        out.close();
                    }
                }
            }
        } else {
            System.out.println("Source or Destination file doesn't exist!");
        }
    }

    private void closeReader(Reader reader) {
        try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /*private void closeWriter(PrintWriter writer) {
        try {
            if (writer != null) {
                writer.close();
            }
        } catch (NullPointerException ex) {
            ex.printStackTrace();;
        }
    }*/
}