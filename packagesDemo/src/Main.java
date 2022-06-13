//import math.FourOperations;
//import math.Logarithm;
// Alternative Usage
import math.*;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adınızı giriniz : ");

        String name = scanner.nextLine();

        System.out.println("Merhaba " + name);

        FourOperations fourOperations = new FourOperations();

        System.out.println(fourOperations.add(3, 8));

        Logarithm logarithm = new Logarithm();
        logarithm.calculateLog();


        // Another Usage but not suggested.
        // math.FourOperations
    }
}