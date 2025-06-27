public class typecasting {
    public static void main(String[] args) {
        int intval = 10;
        double d = intval; // implicit
        System.out.println("Implicit casting (int to double): " + intval + " -> " + d);

        // Explicit casting (double to int)
        double originalDouble = 42.99;
        int castedInt = (int) originalDouble; // explicit
        System.out.println("Explicit casting (double to int): " + originalDouble + " -> " + castedInt);

        // Char to int
        char charval = 'A';
        int asciVal = charval; // implicit
        System.out.println("Char to int (ASCII value of '" + charval + "'): " + asciVal);

        // Int to char
        int code = 66;
        char charFromInt = (char) code; // explicit
        System.out.println("Int to char (ASCI" + code + "): " + charFromInt);
    }
}
