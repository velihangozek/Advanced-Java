import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // createFile();
        // getFileInfo();
        // readFile();
         writeFile();
    }

    public static void createFile() {
        File file = new File("C:\\JavaDemos\\files\\students.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File has been created!");
            } else {
                System.out.println("Couldn't create file, it already exists!");
            }
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    public static void getFileInfo() {
        File file = new File("C:\\JavaDemos\\files\\students.txt");
        if (file.exists()) {
            System.out.println("File name : " + file.getName());
            System.out.println("File path : " + file.getAbsolutePath());
            System.out.println("Is file writable ? : " + file.canWrite());
            System.out.println("Is file readable ? : " + file.canRead());
            System.out.println("File size (byte): " + file.length());
        }
    }

    public static void readFile() {
        File file = new File("C:\\JavaDemos\\files\\students.txt");

        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFile() {
        try {
           BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\JavaDemos\\files\\students.txt", true)) ;
           bufferedWriter.newLine();
           bufferedWriter.write("Altan");
            bufferedWriter.newLine();
            bufferedWriter.write("Velihan");
           System.out.println("Written on file!");
           bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}