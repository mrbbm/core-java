class PostPreIncrement {
    public static void main(String[] args) {
        int i, j;
        
        // CASE #1
        i = 5;
        i++;
        System.out.printf("CASE #1: The Value of i is %d \n", i); // Output : CASE #1: The Value of i is 6

        // CASE #2
        i = 5;
        j = i++;
        System.out.printf("CASE #2: The Value of i is %d and j is %d \n", i, j); // Output : CASE #2: The Value of i is 6 and j is 5

        // CASE #3
        i = 5;
        j = ++i;
        System.out.printf("CASE #3: The Value of i is %d and j is %d \n", i, j); // Output : CASE #3: The Value of i is 6 and j is 6

        // CASE #4
        i = 5;
        i = i++;
        System.out.printf("CASE #4: The Value of i is %d \n", i); // Output : CASE #4: The Value of i is 5

        // CASE #4 is similar like
        i = 5;
        int temp = i;
        i++;
        i = temp;
        System.out.printf("CASE #4 (Anex): The Value of i is %d \n", i); // Output : CASE #4 (Anex): The Value of i is 5

        // CASE #5
        i = 5;
        i = ++i;
        System.out.printf("CASE #5: The Value of i is %d \n", i); // Output : CASE #5: The Value of i is 6
    }
}