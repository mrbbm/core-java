class LeftRightShiftOperator {
    public static void main(String[] args) {
        int a = 8; // Binary -> 1 0 0 0 . 0 0
        int b = a << 2; // Binary -> 1 0 0 0 0 0 . 0 0 adds two ZERO's in the right most digit (New
                        // value is 32)
        System.out.printf("The Left Shift of %d << 2 is %d \n", a, b);
        // Output: The Left Shift of 8 << 2 is 32

        int c = 8; // Binary -> 1 0 0 0 . 0 0
        int d = a >> 2; // Binary -> 1 0 . 0 0 0 0 moves two right most digit after the precision (New
                        // value is 2)
        System.out.printf("The Right Shift of %d << 2 is %d \n", c, d);
        // Output: The Left Shift of 8 << 2 is 2

        float e = 8.25F; // Binary -> 1 0 0 0 . 0 0
        float f = a << 2; // Binary -> 1 0 0 0 0 0 . 0 0 adds two ZERO's in the right most digit (New
                          // value is 32.0000)
        System.out.printf("The Left Shift of %.4f << 2 is %.4f \n", e, f);
        // Output: The Left Shift of 8.2500 << 2 is 32.0000

        float g = 8.25F; // Binary -> 1 0 0 0 . 0 0
        float h = a >> 2; // Binary -> 1 0 . 0 0 0 0 moves two right most digit after the precision (New
                          // value is 2.0000)
        System.out.printf("The Right Shift of %.4f << 2 is %.4f \n", g, h);
        // Output: The Left Shift of 8.2500 << 2 is 2.0000
    }
}