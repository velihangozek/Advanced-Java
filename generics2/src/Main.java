import java.util.*;

public class Main {


    public static void main(String[] args) {

        // Before Generics.

        List listOfCountries = new ArrayList();
        listOfCountries.add("India");
        String country = (String) listOfCountries.get(0);

        // After Generics, typecasting of the object is not required.

        List<String> list = new ArrayList<>();
        list.add("Turkey");
        String string = list.get(0);

        // Compile-time Checking.

        List<String> list2 = new ArrayList<>();
        list2.add("Hello");

        //  list2.add(5); // Compile-time Error.

        // For an instance of Generic Class.

        // BaseType <Type> Object = new BaseType<>;
        // Note: In parameter Type, we cannot use primitives like int, char, float, etc.

        // For Area Class:

        // Object of generic class "Area" with parameter Type as Integer.
        Area<Integer> rectangle = new Area<>();
        // Object of generic class Area with parameter Type as Double.
        Area<Double> circle = new Area<>();
        rectangle.add(10);
        circle.add(2.5);
        System.out.println("Area rectangle : " + rectangle.getT());
        System.out.println("Area circle : " + circle.getT());
    }
}



