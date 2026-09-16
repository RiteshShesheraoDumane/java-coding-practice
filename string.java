
public class string {

    public static void main(String[] args) {

        String str = "ritesh";

        // 1. length()
        int result = str.length();
        System.out.println("Length: " + result);

        // 2. toUpperCase()
        String upper = str.toUpperCase();
        System.out.println("Uppercase: " + upper);

        // 3. toLowerCase()
        String lower = str.toLowerCase();
        System.out.println("Lowercase: " + lower);

        // 4. concat()
        String str2 = str.concat(" dumne");
        System.out.println("After concat: " + str2);

        // 5. equals()
        String name = "Ritesh";

        System.out.println("Using equals(): " + str.equals(name));

        // 6. equalsIgnoreCase()
        System.out.println(
            "Using equalsIgnoreCase(): " + str.equalsIgnoreCase(name)
        );

        // 7. charAt()
        char ch = str.charAt(0);
        System.out.println("First character: " + ch);

        // 8. contains()
        boolean check = str.contains("tes");
        System.out.println("Contains 'tes': " + check);

        // 9. substring()
        String sub = str.substring(0, 3);
        System.out.println("Substring: " + sub);

        // 10. replace()
        String replaced = str.replace("ritesh", "Rahul");
        System.out.println("After replace: " + replaced);
    }
}

