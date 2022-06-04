
// For java to recognize this as a public class, the filename must be the same as the class name: 
// HelloWorld.java => public class HelloWorld

// Naming conventions recommend that Java classes begin with an uppercase character, and be in camel case format:
// (exemplo) CamelCaseCamelCase

// The "Hello World" program contains a single file, which consists of a HelloWorld class definition,
// a main method, and a statement inside the main method

public class HelloWorld { // Every java aplication contains at least one class definition
    public static void main (String[] args) { // This is an entery point method 
        System.out.println("Hello, World!");

    } // end of main function scope
}     // end of class HelloWorld scope

// PUBLIC : meaning that the program con be called from anywhere mean from outside the program as well
// STATIC : meaning it exists and can ve run by itself (at the class level without creating an object)
// VOID   : meaning it returns no value
//          Note: This is unlike C where a return code such as int is expected

// This main method accepts:
//      . An array of Strings passed as arguments to main function (e.g. from command line argumments)

// Non-required parts:
//      . The name args is a variable name, so it can be called anything (but it's typically called args)

// SYSTEM : this denotes that the subsequent expression will call upon the System class, from the java.lang pachage
// .      : Dot operators provide you access to a classes members1; 
//          i.e. its fields (variables and its methods). In this case
//          In this case, it allows you to reference the out static field within the System class
// out    : contains the standard output funcionality