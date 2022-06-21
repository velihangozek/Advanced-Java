public class Main {
    public static void main(String[] args) {
        Validator validator = new Validator();
        Product product = new Product();
        validator.validate(product);
        validator.validate(new Customer());
       // validator.validate(new Validator()); Not an entity (object) of database.
    }
}