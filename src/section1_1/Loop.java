package section1_1;

public class Loop {
    public static void main(String[] args) {
        //Java While Loop
        int i = 0;
        while (i < 5) {
            System.out.println("While Loop iteration: " + i);
            i++;
        }
        //Java Do-While Loop
        int j = 0;
        do {
            System.out.println("Do-While Loop iteration: " + j);
            j++;
        } while (j < 5);

        //for loop
        for (int k = 0; k < 5; k++) {
            System.out.println("For Loop iteration: " + k);
        }
        //Enhanced for loop (for-each)
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("Enhanced For Loop iteration: " + number);
        }
    }
}
