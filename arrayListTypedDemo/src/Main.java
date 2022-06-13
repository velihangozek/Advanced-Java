import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Gaziantep");
        // cities.add(1); // --> Cannot add int into String ArrayList.
        cities.add("İstanbul");
        cities.add("Ankara");
        cities.add("Balıkesir");
        cities.remove("İstanbul");
        System.out.println("Unsorted : " + cities);
        Collections.sort(cities);
        System.out.println("Sorted : " + cities);
        System.out.println("get 0. element : " + cities.get(0));
        System.out.println("Foreach Loop : ");
        for (String city : cities) {
            System.out.println(city);
        }

    }
}