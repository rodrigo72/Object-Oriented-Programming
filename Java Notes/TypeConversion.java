
// NUMERIC PRIMITIVE CASTING

public class TypeConversion {
    
    // Implicit casting:
    // happens when the source type has SMALLER range than the target type
    byte byteVar = 42;
    short shortVar = byteVar;
    int intVar = shortVar;
    long longVar = intVar;
    float floatVar = longVar;
    double doubleVar = floatVar;

    // Explicit casting:
    // has to be done when the source type has larger range than the target type
    double doubleVar2 = 42.0d;
    float floatVar2 = (float) doubleVar;
    long longVar2 = (long) floatVar;
    int intVar2 = (int) longVar;
    short shortVar2 = (short) intVar;
    byte byteVar2 = (byte) shortVar;

    char char1 = 1, char2 = 2;
    short short1 = 1, short2 = 2;
    int int1 = 1, int2 = 2;
    float float1 = 1.0f, float2 = 2.0f;

    // char1 = char1 + char2; // Error: Cannot convert from int to char;
    // short1 = short1 + short2; // Error: Cannot convert from int to short;
    // int1 = char1 + char2; char is promoted to int.
    // int1 = short1 + short2; short is promoted to int.
    // int1 = char1 + short2; both char and short promoted to int.
    // float1 = short1 + float2; short is promoted to float.
    // int1 = int1 + int2; int is unchanged.

    // NON-NUMERIC PRIMITIVE CASTING
    // int badInt = (int) true; -> Compiler Error: imcompatible types
    char char3 = (char) 65; // A

    // OBJECT CASTING
    Float floatVar3 = new Float(42.0f);
    Number n = floatVar3;                // Implicit (Float implements Number)
    Float floatVar4 = (Float) n;        // Explicit
    Double doubleVar3 = (Double) n;     // Throws exception (the object is not Double)

    // TESTING IF AN OBJECT CAN BE CAST USING INSTANCEOF
    // Java provides the instanceof operator to test if an object is of a certain type, or a subclass of that type
    // The program can then choose to cast or not cast thar object accordingly

    // Object obj = Calendar.getInstance();
    // long time = 0;

    // if(obj instanceof Calendar) {
    //     time = ((Calendar)obj).getTime();
    // }

    // if(obj instanceof Date) {
    //     time = ((Date)obj).getTime();  This line will never be reached, obj is not a Date type.
    // }

}