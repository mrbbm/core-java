class ByteToNumber {
    public static void main(String[] args) {
        int b = 0B10_1; // The prefix '0B' specifies the int is a Byte literal
        System.out.println(b); // Output : 5
        b = 0B100_000_000;
        System.out.println(b); // Output : 256
    }
}