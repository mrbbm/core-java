class Printf {
    public static void main(String[] args) {
        int i, j, k;
        i = 5;
        j = 1;
        k = i + j;
        System.out.println("The addition of " + i + " and " + j + " is " + k);
        System.out.printf("The addition of %d and %d is %d", i, j, k);
    }
}