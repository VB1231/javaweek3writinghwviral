import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class Program1_OddEvenTernaryOperator {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the number:");
        int number = scanner.nextInt();
        isItOddOrEvenNumber(number);
        //closing Scanner
        scanner.close();
    }
    public static void isItOddOrEvenNumber(int number){
        //ternary operator is used
        String evenOrOdd = (number %2==0)?"Even":"Odd";
        System.out.println("The "+number+"is"+evenOrOdd+"number" );
    }
}
