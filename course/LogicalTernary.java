class LogicalTernary {
    public static void main(String[] args) {
        int i = 1;

        int j = (i == 1) ? 6 : 12;
        System.out.printf("The value of 'j' is %d \n", j);

        Object k = (i == 1) ? 6 : 12.5;

        System.out.print("The value of 'k' is " + k); // output is of type double
    }
}