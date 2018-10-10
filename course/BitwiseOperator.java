class BitwiseOperator {
    public static void main(String[] args) {
        int a = 25; // Binary -> 1 1 0 0 1
        int b = 15; // Binary -> 0 1 1 1 1
        // ________________________________
        //                AND -> 0 1 0 0 1 => 9
        //                 OR -> 1 1 1 1 1 => 31
        // ________________________________

        int x = a & b;
        System.out.printf("AND Operator: The value of %d & %d is %d \n", a, b, x);
        // Output: AND Operator: The value of 25 & 15 is 9

        int y = a | b;
        System.out.printf("OR Operator: The value of %d | %d is %d \n", a, b, y);
        // Output: OR Operator: The value of 25 | 15 is 31
    }
}