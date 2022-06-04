// Using a setter or a getter to implement a constraint

// Setters and Getters for an object to contain private variables which can be accessed and changed with restrictions.
// For example:

public class Person {
    // In this 'Person' class, there's a single variable: 'name'.
    private String name;

    // This variable can be accessed using the getName() method
    public String getName() {
        return name;
    }

    // And changed using the setName(String) method, however, setting a name requires the new name to have a length greater than
    // 2 characters and to not be null.
    public void setName (String name) {
        if (name != null && name.length() > 2)
            this.name = name; 
    }

    // [!] Using a setter method rather than making the variable 'name' public allows others to set the value of 'name' with
    //     certain restrictions. The same can be aplied to the getter method:

    public String getName2() {
        if (name.length() > 16)
            return "Name is too large!";
        else 
            return name;
    }

    // ^ This allows the programmer to create variables that are reachable and modifieble however they wish
    //   preventing client classes from editing the variables unwantedly

}

