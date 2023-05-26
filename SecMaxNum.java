import java.util.Scanner;

public class SecMaxNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Input How many sets of of numbers there are:");
        int N = scanner.nextInt();


        int[][] arr = new int[N][3];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Input number " + (j+1));
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            int max = Integer.MIN_VALUE;
            int sec = Integer.MIN_VALUE;

            for (int j = 0; j < 3; j++) {
                int num = arr[i][j];
                if (num > max) {
                    sec = max;
                    max = num;
                } else if (num > sec) {
                    sec = num;
                }
            }

            System.out.println("The second highest number for set " + (i+1) + " is:");
            System.out.println(sec);
        }
    }
}