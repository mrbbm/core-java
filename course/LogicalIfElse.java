class LogicalIfElse {
    public static void main(String[] args) {
        int i = 5;

        if (i % 2 == 0) {
            System.out.printf("The given number %d is EVEN ! \n", i);
        } else {
            System.out.printf("The given number %d is ODD ! \n", i);
        }

        int a, b, c;
        a = 4;
        b = 2;
        c = 6;

        if ((a > b) && (a > c)) {
            System.out.printf("The greatest number is 'a' : %d \n", a);
        } else if (b > c) {
            System.out.printf("The greatest number is 'b' : %d \n", b);
        } else {
            System.out.printf("The greatest number is 'c' : %d \n", c);
        }
    }
}