class Ascii {
    public static void main(String[] args) {
        // ASCII is 7 bit
        // 7^2
        // 128 -> 0 to 127

        for (int i = 0; i <= 127; i++) {
            System.out.printf("%d : %c \n", i, i);
        }
    }
}