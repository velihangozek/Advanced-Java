public class Main {


    public static void main(String[] args) throws Exception {

        // Regardless of the value of the parameter count, the JVM executes the "finally" block and prints “In finally”:

//        String count = "a";
//        try {
//            System.out.println("The count is " + Integer.parseInt(count));
//        } catch (NumberFormatException e) {
//            throw new RuntimeException("No count");
//        } finally {
//            System.out.println("Inside finally");
//        }

        // Using finally Without a catch Block

        // Also, we can use a "finally" block with a "try" block regardless of whether a "catch" block is present:

//        try {
//            System.out.println("Inside try");
//        } finally {
//            System.out.println("Inside finally");
//        }

        // When "finally" Is Executed

        // No Exception Is Thrown

        // When the try block completes, the "finally" block is executed, even if there was no exception:

//        try {
//            System.out.println("Inside try");
//        } finally {
//            System.out.println("Inside finally");
//        }

        // Exception Is Thrown and Not Handled

        // If there's an exception, and it is not caught, the "finally" block is still executed:

//        try {
//            System.out.println("Inside try");
//            throw new Exception();
//        } finally {
//            System.out.println("Inside finally");
//        }

        // Exception Is Thrown and Handled

        // If there's an exception, and it is caught by the catch block, the "finally" block is still executed:

//        try {
//            System.out.println("Inside try");
//            throw new Exception();
//        } catch(Exception e) {
//            System.out.println("Inside catch");
//        } finally {
//            System.out.println("Inside finally");
//        }

        // Method Returns from try Block

        // Even returning from the method will not prevent finally blocks from running:

        // System.out.println(returnFromTry());

        // Method Returns from catch Block

        // When the catch block contains a return statement, the "finally" block is still called:

//        System.out.println(returnFromCatch());

        // When finally Isn’t Executed

        // Invoking System.exit

        // In this case, we are terminating the JVM by calling System.exit and hence the JVM will not execute our
        // finally block:

//        try {
//            System.out.println("Inside try");
//            System.exit(1);
//        } finally {
//            System.out.println("Inside finally");
//        }

        // Invoking halt

        // Similar to System.exit, a call to Runtime.halt also halts  the execution and the JVM does not execute
        // any finally blocks:

//        try {
//            System.out.println("Inside try");
//            Runtime.getRuntime().halt(1);
//        } finally {
//            System.out.println("Inside finally");
//        }

        // Daemon Thread

        // If a Daemon thread enters the execution of a try/finally block and all other non-daemon threads exit before
        // the daemon thread executes the "finally" block, the JVM does not wait for the daemon thread to finish the
        // execution of finally block:

//        Runnable runnable = () -> {
//            try {
//                System.out.println("Inside try " + Thread.currentThread());
//            } finally {
//                try {
//                    Thread.sleep(1000);
//                    System.out.println("Inside finally " + Thread.currentThread());
//                } catch(InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        };
//
//        Thread regular = new Thread(runnable,"regular");
//        Thread daemon = new Thread(runnable,"daemon");
//        daemon.setDaemon(true);
//        regular.start();
//        Thread.sleep(300);
//        daemon.start();

        // JVM Reaches an Infinite Loop

        // Here's a try block which contains an infinite while loop:

//        try {
//            System.out.println("Inside try");
//            while(true) {
//            }
//        } finally {
//            System.out.println("Inside finally");
//        }

        // Common Pitfalls

        // There are some common pitfalls that we must avoid when we use the "finally" block.
        // Although it's perfectly legal, it's considered bad practice to have a return statement or throw an exception
        // from a "finally" block, and we should avoid it at all costs.

        // Disregards Exception

        // A return statement in the "finally" block ignores an uncaught exception:

        // System.out.println(returnFromFinally());

        // Ignores Other return Statements

        // A return statement in the "finally" block ignores any other return statement in the try or catch block.
        // Only the return statement in the "finally" block executes:

        // System.out.println(returnOnlyFromFinally());

        // Changes What's Thrown or Returned

        // Also, in the case of throwing an exception from a "finally" block, the method disregards the exception thrown
        // or return statements in the try and catch blocks:

        System.out.println(ignoreReturnFromTry());

    }

    // Method Returns from try Block

    // Even returning from the method will not prevent finally blocks from running:

//    public static String returnFromTry() {
//        try {
//            System.out.println("Inside try");
//            return "from try";
//        } finally {
//            System.out.println("Inside finally");
//        }
//    }

    // Method Returns from catch Block

    // When the catch block contains a return statement, the "finally" block is still called:

//    public static String returnFromCatch() {
//        try {
//            System.out.println("Inside try");
//            throw new Exception();
//        } catch (Exception e) {
//            System.out.println("Inside catch");
//            return "from catch";
//        } finally {
//            System.out.println("Inside finally");
//        }
//    }

    // Disregards Exception

    // A return statement in the "finally" block ignores an uncaught exception:

//    public static String returnFromFinally() {
//        try {
//            System.out.println("Inside try");
//            throw new RuntimeException();
//        } finally {
//            System.out.println("Inside finally");
//            return "from finally";
//        }
//    }

    // Ignores Other return Statements

    // A return statement in the "finally" block ignores any other return statement in the try or catch block.
    // Only the return statement in the "finally" block executes:

//    public static String returnOnlyFromFinally() {
//        try {
//            System.out.println("Inside try");
//            return "from try";
//        } finally {
//            System.out.println("Inside finally");
//            return "from finally";
//        }
//    }

    // Changes What's Thrown or Returned

    // Also, in the case of throwing an exception from a "finally" block, the method disregards the exception thrown
    // or return statements in the try and catch blocks:

    public static String ignoreReturnFromTry() {
        try {
            System.out.println("Inside try");
            return "from try";
        } finally {
            System.out.println("Inside finally");
            throw new RuntimeException();
        }
    }

}