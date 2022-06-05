public class ReferenceDataTypes {

    // Dereferencing + Instantiating a reference type
    Object obj = new Object(); // note the 'new' keyword
    String text = obj.toString();
    // Dereferencing follows the memory address stored in a reference, to the place in memory where the actual project resides

    Object obj2 = null;
    //obj2.toString(); -> NullPointerException

}

// . 'Object is a reference type
// . 'obj' is the variable in which to store the new reference
// . 'Object()' is the call to a constructor of 'Object'

// . Space in memory is allocated for the object
// . The constructor 'Object()' is called to initialize that memory space
// . The memory address is stored in 'obj', so that it *references* the newly created object

// This is different from primitives:
// int i = 10;
// Where the actual value 10 is stored in i