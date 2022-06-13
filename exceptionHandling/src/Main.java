public class Main {
    public static void main(String[] args) {
//        String city = "Gaziantep";
//        int number = city;
        try {
            int[] numbers = new int[]{1, 2, 3};
            System.out.println(numbers[5]); // --> Catch Case.
            // System.out.println(numbers[2]); // --> Try Case.
        }
//        catch (Exception exception) {
//            //System.out.println("Error occurred!");
//            System.out.println(exception);
//        }

        // Collapsed Catch Blocks.
//        catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException exception) {
//            System.out.println(exception);
//        }
//        catch (ArrayIndexOutOfBoundsException exception) {
//            System.out.println(exception);
//        }
        // Couldn't catch because it's not a StringIndexOutOfBoundsException.
        catch (StringIndexOutOfBoundsException exception) {
            System.out.println(exception);
        }
        catch (Exception exception) {
            System.out.println("Logged! : " + exception);
        }
        // Couldn't catch because it's not a StringIndexOutOfBoundsException.
        finally {
            System.out.println("I will run in any case!");
        }

    }
}