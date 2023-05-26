import java.util.Scanner;

public class NumSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        System.out.println("How many strings do you want to test?");
        int instances = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < instances; i++) {
            System.out.println("Enter the string you want to test");
            String line = scanner.nextLine();
            int sum = 0;

            for (int j = 0; j < line.length(); j++) {
                char ch = line.charAt(j);

                if (Character.isDigit(ch)) {
                    int temp = Character.getNumericValue(ch);
                    sum += temp;
                }
            }
            System.out.println(sum);
        }
    }
}