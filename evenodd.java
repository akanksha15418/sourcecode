class EvenOddChecker {
    public String checkEvenOdd(int num) {
        if (num % 2 == 0) {
            return num + " is an even number.";
        } else {
            return num + " is an odd number.";
        }
    }

    public static void main(String[] args) {
        EvenOddChecker checker = new EvenOddChecker();
        
        // Test the checkEvenOdd method
        int number = 10; // Example number to check
        String result = checker.checkEvenOdd(number);
        System.out.println(result); // Output: "10 is an even number."
        
        number = 7; // Another example
        result = checker.checkEvenOdd(number);
        System.out.println(result); // Output: "7 is an odd number."
    }
}
