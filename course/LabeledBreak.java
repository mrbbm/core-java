class LabeledBreak {
    public static void main(String[] args) {

        // Labeled Break Statement - Its a free string literal "java"
        java: for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 3) {
                    break java;
                }
                System.out.print("* ");
            }

            System.out.println("");
        }
    }
}