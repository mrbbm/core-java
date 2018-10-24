class ReverseNumber {
    public static void main(String[] args) {
        int n = 123;

        System.out.println("Original Number : " + n);

        int r, s = 0;

        while (n > 0) {
            r = n % 10;
            n = n / 10;
            s = s * 10 + r;
        }

        System.out.println("Reverse Number : " + s);
    }
}