import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        int[] numbers = new int[] {1, 2, 3};
//        // numbers[3] = 4; // --> ArrayIndexOutOfBoundsException.
//        numbers = new int[4];
//        System.out.println(numbers[0]); // Outout is 0. Default Int number = 0.

        ArrayList numbers = new ArrayList();
        System.out.println(numbers.size());
        numbers.add(1);
        numbers.add(10);
        numbers.add("Gaziantep");
        System.out.println(numbers.size());
        System.out.println(numbers.get(2));
        numbers.set(0, "Velihan");
        System.out.println(numbers);
        // numbers.set(5, 20); // IndexOutOfBoundsException
//        numbers.remove(1);
//        System.out.println(numbers);
//        numbers.clear();
//        System.out.println(numbers);
        for (Object i : numbers) {
            System.out.println(i);
        }
    }
}