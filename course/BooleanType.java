class BooleanType {
    public static void main(String[] args) {
        boolean b;
        // System.out.println(b); Build failed due to non initialization of variable b

        b = true;
        System.out.printf("The value of b is %b \n", b);

        b = !b;
        System.out.printf("The value of b is %b \n", b);
    }
}