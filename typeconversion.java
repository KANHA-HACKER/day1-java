public class TestJava {
    public static void main(String[] args) {
        // Byte conversions
        byte byteVal = 100;
        System.out.println("Original byte: " + byteVal);
        
        // byte to other types
        short byteToShort = byteVal; // implicit
        int byteToInt = byteVal; // implicit
        long byteToLong = byteVal; // implicit
        float byteToFloat = byteVal; // implicit
        double byteToDouble = byteVal; // implicit
        char byteToChar = (char) byteVal; // explicit
        
        System.out.println("byte to short: " + byteToShort);
        System.out.println("byte to int: " + byteToInt);
        System.out.println("byte to long: " + byteToLong);
        System.out.println("byte to float: " + byteToFloat);
        System.out.println("byte to double: " + byteToDouble);
        System.out.println("byte to char: " + byteToChar);

        // Short conversions
        short shortVal = 1000;
        System.out.println("\nOriginal short: " + shortVal);
        
        // short to other types
        byte shortToByte = (byte) shortVal; // explicit
        int shortToInt = shortVal; // implicit
        long shortToLong = shortVal; // implicit
        float shortToFloat = shortVal; // implicit
        double shortToDouble = shortVal; // implicit
        char shortToChar = (char) shortVal; // explicit
        
        System.out.println("short to byte: " + shortToByte);
        System.out.println("short to int: " + shortToInt);
        System.out.println("short to long: " + shortToLong);
        System.out.println("short to float: " + shortToFloat);
        System.out.println("short to double: " + shortToDouble);
        System.out.println("short to char: " + shortToChar);

        // Int conversions
        int intVal = 100000;
        System.out.println("\nOriginal int: " + intVal);
        
        // int to other types
        byte intToByte = (byte) intVal; // explicit
        short intToShort = (short) intVal; // explicit
        long intToLong = intVal; // implicit
        float intToFloat = intVal; // implicit
        double intToDouble = intVal; // implicit
        char intToChar = (char) intVal; // explicit
        
        System.out.println("int to byte: " + intToByte);
        System.out.println("int to short: " + intToShort);
        System.out.println("int to long: " + intToLong);
        System.out.println("int to float: " + intToFloat);
        System.out.println("int to double: " + intToDouble);
        System.out.println("int to char: " + intToChar);

        // Long conversions
        long longVal = 10000000000L;
        System.out.println("\nOriginal long: " + longVal);
        
        // long to other types
        byte longToByte = (byte) longVal; // explicit
        short longToShort = (short) longVal; // explicit
        int longToInt = (int) longVal; // explicit
        float longToFloat = longVal; // implicit
        double longToDouble = longVal; // implicit
        char longToChar = (char) longVal; // explicit
        
        System.out.println("long to byte: " + longToByte);
        System.out.println("long to short: " + longToShort);
        System.out.println("long to int: " + longToInt);
        System.out.println("long to float: " + longToFloat);
        System.out.println("long to double: " + longToDouble);
        System.out.println("long to char: " + longToChar);

        // Float conversions
        float floatVal = 123.456f;
        System.out.println("\nOriginal float: " + floatVal);
        
        // float to other types
        byte floatToByte = (byte) floatVal; // explicit
        short floatToShort = (short) floatVal; // explicit
        int floatToInt = (int) floatVal; // explicit
        long floatToLong = (long) floatVal; // explicit
        double floatToDouble = floatVal; // implicit
        // char conversion from float not meaningful
        
        System.out.println("float to byte: " + floatToByte);
        System.out.println("float to short: " + floatToShort);
        System.out.println("float to int: " + floatToInt);
        System.out.println("float to long: " + floatToLong);
        System.out.println("float to double: " + floatToDouble);

        // Double conversions
        double doubleVal = 123456.789012;
        System.out.println("\nOriginal double: " + doubleVal);
        
        // double to other types
        byte doubleToByte = (byte) doubleVal; // explicit
        short doubleToShort = (short) doubleVal; // explicit
        int doubleToInt = (int) doubleVal; // explicit
        long doubleToLong = (long) doubleVal; // explicit
        float doubleToFloat = (float) doubleVal; // explicit
        // char conversion from double not meaningful
        
        System.out.println("double to byte: " + doubleToByte);
        System.out.println("double to short: " + doubleToShort);
        System.out.println("double to int: " + doubleToInt);
        System.out.println("double to long: " + doubleToLong);
        System.out.println("double to float: " + doubleToFloat);

        // Char conversions
        char charVal = 'A';
        System.out.println("\nOriginal char: " + charVal);
        
        // char to other types
        byte charToByte = (byte) charVal; // explicit
        short charToShort = (short) charVal; // explicit
        int charToInt = charVal; // implicit
        long charToLong = charVal; // implicit
        float charToFloat = charVal; // implicit
        double charToDouble = charVal; // implicit
        
        System.out.println("char to byte: " + charToByte);
        System.out.println("char to short: " + charToShort);
        System.out.println("char to int: " + charToInt);
        System.out.println("char to long: " + charToLong);
        System.out.println("char to float: " + charToFloat);
        System.out.println("char to double: " + charToDouble);

        // Boolean conversions (limited)
        boolean boolVal = true;
        System.out.println("\nOriginal boolean: " + boolVal);
        
        // boolean can't be directly converted to numeric types
        // Common approach is to use ternary operator
        int boolToInt = boolVal ? 1 : 0;
        System.out.println("boolean to int: " + boolToInt);
    }
}
