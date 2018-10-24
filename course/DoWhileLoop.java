class DoWhileLoop {
    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println("Common case" + i);
            i++;
        } while (i <= 10);

        i = 15;

        do {
            System.out.println("Do While tricky case " + i);
            i++;
        } while (i <= 10);
    }
}