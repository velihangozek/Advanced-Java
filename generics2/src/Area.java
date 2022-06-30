// Java program to show the instance of a generic class.

// Generic Classes

// We use <> to specify parameter type, and we can add any datatype
// like Integer, Double, String, Character or any user defined Datatype.

// Every time when we need to make an object of another datatype of this generic class , we don't need to make
// the whole class of that datatype again instead we can simply change the parameter/Datatype in braces <>.

public class Area<T> {

    // T is the Datatype like String, Integer of which Parameter type, the class Area is of.

    private T t;

    public void add(T t) {
        // this.t specifies the t variable inside the Area Class whereas the right-hand
        // side t simply specifies the value as the parameter of the function add().
        this.t = t;
    }
    public T getT() {
        return t;
    }
    public void getArea() {

    }
}
