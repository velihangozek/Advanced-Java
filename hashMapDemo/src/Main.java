import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("Book", "Kitap");
        dictionary.put("Table", "Masa");
        dictionary.put("Computer", "Bilgisayar");
        System.out.println(dictionary);
        System.out.println("Eleman sayısı : " + dictionary.size());
        System.out.println("Traversing keySet and values : ");
        for (String item1 : dictionary.keySet()) {
            System.out.println("Key - " + item1 + " , " + "Value - " + dictionary.get(item1));
        }
        System.out.println("Traversing keySet : ");
        for (String item2 : dictionary.keySet()) {
            System.out.println("Key : " + item2);
        }
        System.out.println("Traversing values : ");
        for (String item3 : dictionary.values()) {
            System.out.println("Value : " + item3);
        }
        System.out.println("Computer's Value : " + dictionary.get("Computer"));
        dictionary.remove("Book");
        System.out.println("Book removed : " + dictionary);
        System.out.println("Eleman sayısı : " + dictionary.size());
        System.out.println("Book's reference : " + dictionary.get("Book")); // null
        dictionary.clear();
        System.out.println("Dictionary is clear : " + dictionary);
        System.out.println("Eleman sayısı : " + dictionary.size());


    }
}