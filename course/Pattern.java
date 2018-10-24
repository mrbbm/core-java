class Pattern {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("* ");
            }

            System.out.println("");
        }

        System.out.println("");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println("");
        }

        System.out.println("");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 || i == 3 || j == 0 || j == 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println("");
        }

        System.out.println("");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int k = i + j + 1;

                if (k > 4) {
                    System.out.printf("%d ", k - 4);
                } else {
                    System.out.printf("%d ", k);
                }

            }

            System.out.println("");
        }

        System.out.println("");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                int k = (i + j + 1) % 2;
                System.out.printf("%d ", k);
            }

            System.out.println("");
        }

        System.out.println("");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%d ", i + 1);
            }

            System.out.println("");
        }

        System.out.println("");
        /*
         * 
         * 1 2 3 4 2 3 4 1 3 4 1 2 4 1 2 3
         */
    }
}