import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    //    public static void main(String[] args) throws FileNotFoundException {
//        BufferedReader bufferedReader = new BufferedReader(new FileReader("numbers.txt"));
//    }
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        int total = 0;
        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\JavaDemos\\readingFileDemo\\src\\numbers.txt"));
            String line = null;
            // Better Way :
            while ((line = bufferedReader.readLine()) != null) {
                total += Integer.valueOf(line);
            }
            System.out.println("Total is = " + total);
            // My Way :
//            for (int i = 0; i < 5; i++) {
//                total = total + Integer.parseInt(bufferedReader.readLine());
//            }
//            System.out.println(total);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Number Format is incorrect! : " + e);
            // e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close(); // Or use "throws" in the method signature.
            } catch (Exception exception) {

            }

        }
    }

}