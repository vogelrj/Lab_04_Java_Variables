public class Lab_04_Java_Variables {
    public static void main(String[] args) {
        int intOperandA = 4;
        int intOperandB = 2;
        int intSum;
        int intProduct;
        int intDifference;
        int intQuotient;
        int intModulo;
        int familySize = 1;
        int favNum = 2;
        double doubleOperandA = 4.5;
        double doubleOperandB = 5.4;
        double doubleSum;
        double doubleProduct;
        double doubleDifference;
        double doubleQuotient;
        double doubleModulo;
        double gasPrice = 3.74;
        double shoeSize = 12.5;
        String birthMonth = "January";
        String fullName = "Rudi Jordan Vogel";
        boolean isRaining = false;
        intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);
        intProduct = intOperandA * intOperandB;
        System.out.println("The product using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);
        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient using ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient);
        intDifference = intOperandA - intOperandB;
        System.out.println("The difference using ints of " + intOperandA + " and " + intOperandB + " is " + intDifference);
        intModulo = intOperandA % intOperandB;
        System.out.println("The remainder using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo);
        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);
        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);
        doubleModulo = doubleOperandA % doubleOperandB;
        System.out.println("The remainder using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo);
        System.out.println("The number of kids in my family is " + familySize);
        System.out.println("Is it raining? " + isRaining);
        System.out.println("The price of a gallon of gas is $" + gasPrice);
        System.out.println("My favorite number is " + favNum);
        System.out.println("My shoe size is " + shoeSize);
        System.out.println("My birth month is " + birthMonth);
        System.out.println("My full name is " + fullName);
    }
}
