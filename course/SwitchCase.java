class SwitchCase {
    public static void main(String[] args) {
        int i = 3;

        switch (i) {
        case 0:
            System.out.printf("CASE #0: The value of i is %d \n", i);
            break;
        case 1:
            System.out.printf("CASE #1: The value of i is %d \n", i);
            break;
        case 2:
            System.out.printf("CASE #2: The value of i is %d \n", i);
            break;
        case 3:
            System.out.printf("CASE #3: The value of i is %d \n", i); // No break statement so it executes CASE 4 too.
        case 4:
            System.out.printf("CASE #4: The value of i is %d \n", i);
            break;
        default:
            System.out.printf("DEFAULT CASE #0: The value of i is %d \n", i);
            break;
        }
    }
}