import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        Customer velihan = new Customer(1, "Velihan", "Gözek");
        customers.add(velihan);
        customers.add(new Customer(2, "Furkan", "Baysan"));
        customers.add(new Customer(3, "Altan", "Gözek"));

       //  customers.remove(new Customer(1, "Velihan", "Gözek"));
        customers.remove(velihan);

        for (Customer customer : customers) {
            System.out.println(customer.firstName);
        }

    }
}