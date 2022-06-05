import java.util.*; // Necessary for 'Locale'
import java.util.regex.*; // Necessary for 'Pattern'

class Strings {
    public static void main (String[] args) throws java.lang.Exception {
        String firstString = "Test123";
        String secondString = "Test" + 123;

        if (firstString.equals(secondString)) {
           System.out.print("Equal\n");  // Both strings have the same content
        }

        String thirdString = "TEST123";

        if (firstString.equalsIgnoreCase(thirdString)) {
            System.out.print("Equal\n"); // Both strings are equal, ignoring the case of the individual characters
        }

        String fourthString = "Taki";
        String fifthString  = "TAKI";

        System.out.println(fourthString.equalsIgnoreCase(fifthString)); // prints true

        Locale locale = Locale.forLanguageTag("tr-TR");

        System.out.println(fourthString.toLowerCase(locale).equals(
            fifthString.toLowerCase(locale)
        )); // prints false

        // Comparing with a switch statement
        String stringToSwitch = "A";

        switch (stringToSwitch) {
            case "a":
                System.out.println("a");
                break;
            case "A":
                System.out.println("A"); //the code goes here
                break;
            case "B":
                System.out.println("B");
                break;
            default:
                break;
        }

        String strObj = new String("Hello!");
        String str = "Hello!";

        // The two strings references point two strings that are equal
        if (strObj.equals(str)) {
            System.out.println("The strings are equal");
        }

        // The two string references do not point to the same object (!)
        if (strObj != str) {
            System.out.println("The strings are not the same object");
        }

        // If we intern a string that is equal to a given literal, the result is a tring that has the same reference as the literal
        String internedStr = strObj.intern();

        if (internedStr == str) {
            System.out.println("The interned string and the literal are the same object");
        }

        // Changing the case of characters within a String
        String string = "This is a Random String";
        String upper = string.toUpperCase();
        String lower = string.toLowerCase();

        System.out.println(string);
        System.out.println(lower);
        System.out.println(upper);

        // Changing case of a specific character within an ASCII string:

        // 1. Declare a string
        // 2. INput the string
        // 3. Convert the string into a character array
        // 4. Input the character that is to be searched
        // 5. Search for the character into the character array
        // 6. If found, check if the character is lowercase or uppercase
        // 7. Change the original character from the Character array
        // 8. COnvert the character array back into the string
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = scanner.next();
        char[] a = s.toCharArray();
        System.out.println("Enter the character you are looking for");
        System.out.println(s);
        String c = scanner.next();
        char d = c.charAt(0);

        for (int i = 0; i <= s.length(); i++) {
            if (a[i] == d) {
                if (d >= 'a' && d <= 'z') {
                    d -= 32;
                } else if (d >= 'A' && d <= 'Z') {
                    d += 32;
                }
                a[i] = d;
                break;
            }
        }
        s = String.valueOf(a);
        System.out.println(s);

        // FINDING A STRING WITHIN ANOTHER STRING

        // To check wether a particular String 'a' is being contained in a String 'b' or not, we can use the method String.contains()
        // b.contains(a); -> Return true if a is contained in b, false otherwise
        
        String str1 = "Hello World";
        String str2 = "Hello";
        String str3 = "helLo";

        System.out.println(str1.contains(str2)); // prints true
        System.out.println(str1.contains(str3)); // prints false

        String s2 = "this is a long sentence";
        int i = s2.indexOf('i');     // the first 'i' in String is at index 2
        int j = s2.indexOf("long");  // the index of the first occurrence of "long" in s is 10
        int k = s2.indexOf('z');     // k is -1 because 'z' was not found in String s
        int h = s2.indexOf("LoNg");  // h is -1 because "LoNg" was not found in String s\

        System.out.println(s2 + '\n' + i + ' ' + j + ' ' + k + ' ' + h);

        // STRING POOL AND HEAP STORAGE

        String a1 = "alpha";
        String b1 = "alpha";
        String c1 = new String("alpha");
        System.out.println();

        // All three strings are equivalent
        System.out.println(a1.equals(b1) && b1.equals(c1)); // true

        // Although only a and b reference the same heap object:
        System.out.println(a1 == b1); // true
        System.out.println(a1 != c1); // true
        System.out.println(b1 != c1); // true

        // SPLITING STRINGS

        // You can split a String on a particular delimiting character or a Regular Expression,
        // you can use the String.split() method that has the following structure:
        // public String[] split(String regex)

        // Example using delimiting character:
        String lineFromCsvFile = "hello;good;morning;011";
        String[] dataCells = lineFromCsvFile.split(";");
        // result is dataCells = { "hello" , "good", "morning", "011" };

        // Example using regular expression:
        String lineFromInput = "What    do  you need       from    me?";
        String[] words = lineFromInput.split("\\s+"); // one or more space chars
        // Result is words = {"What", "do", "you", "need", "from", "me?"};

        // The following characters are considered special (aka meta-characters) in regex
        // < > - = ! ( ) [ ] { } \ ^ $ | ? * + .

        // To split a string based on one of the above delimiters, you need to escape them by using \\
        // or use Pattern.quote()

        String s3 = "a|b|c";
        String regex = Pattern.quote("|");
        String[] arr1 = s3.split(regex);
        // or:
        String[] arr2 = s3.split("\\|");

        // Spliting strings with a StringTokenizer
        // StringTokenizer is even more restrictive than String.split(), and also a bit harder to use
        // It is essentially designed for pulling out tokens delimited by a fixed set of characters (given as a String)
        // Each character will act as a separator. Because of this restriction, it's about twice as fast as String.split().

        String str4 = "the lazy fox jumped over the brown fence";
        StringTokenizer tokenizer = new StringTokenizer(str4);
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        } 

        // It is possible to use different sets for separation
        String str5 = "jumped over";
        // In this case character 'u' and 'e' will be used as delimiters
        StringTokenizer tokenizer2 = new StringTokenizer(str5, "ue");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer2.nextToken());
        }

        // JOINING STRINGS WITH A DELIMITER

        // An array of strings can be joined using the static method String.join():

        String[] elements = { "foo", "bar", "foobar" };
        String singleString = String.join(" + ", elements);
        System.out.println(singleString); // Prints "foo + bar + foobar"        

        // Similarly, there's an overloaded String.join() method for Iterables.
        // To have a fine-grained control over joining, you may use StringJoiner class:

        StringJoiner sj = new StringJoiner(", ", "[", "]");
            // The last two arguments are optional,
            // they define a prefix and a sufix for the result string
        sj.add("foo");
        sj.add("bar");
        sj.add("foobar");

        System.out.println(sj); // Prints "[foo, bar, foobar]"

        // To join a stream of strings, you may use the joining collector:
        // Stream<String> stringStream = Stream.of("foo", "bar", "foobar");
        // String joined = stringStream.collect(Collectors.joining(", "));
        // System.out.println(joined); // Prints "foo, bar, foobar"

        // STRING CONCATENATION AND STRINGBUILDERS
        // String concatenation can be performed using the + operator. For example:
        String ss1 = "a";
        String ss2 = "b";
        String ss3 = "c";
        String ss = ss1 + ss2 + ss3; // abc

        // When compiled, the code would look similar to the below:

        StringBuilder sb = new StringBuilder("a");
        String ss4 = sb.append("b").append("c").toString();


    }
}

// [!] Do not use the == operator to compare Strings

// Unless you can guarantee that all strings have been interned, you should not use the == ou != operators to compare strings
// These operatores actually test references, and since multiple String objects can represent the same String, this is
// liable to give the wrong answer.

// Instead, use the String.equals(Object) method, which will compare the String objects based on their values

// Behind the scenes, the interning mechanism maintains a hash table that contains all interned strings that are still reachable
// When you call intern() on a String, the method looks up the object in the hash table:
//  - If the string is found, then that value is return as the interned string
//  - Otherwise, a copy of the string is added to the hash table and that string is returned as the interned string
