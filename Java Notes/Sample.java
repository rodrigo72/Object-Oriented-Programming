public class Sample {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// These private variables cannot be accessed directly from outside the class.
// Hence they are protected from unauthorized access.
// But if you want to view or modify them, you can use Getters and Setters

// The naming convetion of the methods are:
// Non-boolean variables: getVariableName()
//                        setVariableName()
// Boolean variables:     isVariableName()
//                        setVariableName()
