class ShortHandOperators {
    public static void main(String[] args) {
        int i = 5_0; // We can use underscore to make it readable
        i += 1;
        System.out.println(i);

        byte b = 8;
        // b = b * 2.5; -- Output 20.0 (Double) It will throw an error : 
        // incompatible types: possible lossy conversion from double to byte
        b *= 2.5;
        System.out.println(b);
    }
}