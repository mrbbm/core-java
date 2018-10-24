class Palindrome {
    public static void main(String[] args) {

        int remainder, reverseNumber = 0;
        int originalNumber = 5775;
        int temp = originalNumber;

        while (temp > 0) {
            remainder = temp % 10;
            reverseNumber = (reverseNumber * 10) + remainder;
            temp = temp / 10;
        }

        if (originalNumber == reverseNumber) {
            System.out.println("The given number is Palindrome");
        } else {
            System.out.println("The given number is NOT a Palindrome");
        }
    }
}