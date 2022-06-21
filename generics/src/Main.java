import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> cities = new ArrayList<String>();
//        cities.add("Ankara");
//        cities.add("İstanbul");
//        // cities.add(1); // Required type : String
//        cities.add("İzmir");
        // MyList<String> cities = new MyList<>();
        MyList<Customer> cities = new MyList<>();
        // cities.add("Ankara");
        // cities.add(1);
        cities.add(new Customer());
        cities.add(new Customer());

    }
}