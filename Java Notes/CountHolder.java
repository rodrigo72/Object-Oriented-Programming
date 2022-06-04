// Why use Getters and Setters?
// Consider a bisic class containing an object with getters and setters in Java

public class CountHolder {
    private int count = 0;

    public int getCount() { return count; }
    public void setCount(int c) { count = c; }
}

// We can't access the 'count' variable because it's private.
// But we can access the getCount() and the setCount(int) methods because they are puplic
// But why not make count public?

// public class CountHolder2 {
//     public int count = 0;
// }

// The two above are exactly the same, functionality-wise.
// The diference between them is the [extensibility] :
//      - First: "method that gives you an int and a method that will set that value to another int"
//      - Second: "an int that you can set and get as you please"

// The first only lets you interact with its internal natura as *it* dictates
// It gets to choose how the internal interactions occur

// If you are planning on making a variable public, you should judge it against these critirea with extreme prejudice:
//  1. The variable should have no conceivable reason to ever change in its implementation
//  2. The variable needs to be referenced frequently enough that the minimal gains from reducing verbosity warrants it