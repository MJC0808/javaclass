import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("정수를 입력하시오 : "); // Prompt the user to enter an integer
        int number = input.nextInt(); // Read the integer input from the user

        if (number % 2 == 0) {
            System.out.println("짝수입니다."); // Print if the number is even
        } else {
            System.out.println("홀수입니다."); // Print if the number is odd
        }

        input.close(); // Close the Scanner object to avoid resource leak
    }
}
