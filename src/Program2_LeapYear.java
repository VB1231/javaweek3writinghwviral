import java.util.Scanner;

/*
 *Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
public class Program2_LeapYear {
    public static void main(String[] args) {
        //Scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the year :");
        int year = scanner.nextInt();
        Program2_LeapYear leapYear = new Program2_LeapYear();
        leapYear.isItLeapYear(year);
        scanner.close();
    }
    public void isItLeapYear(int year){
        if(year%4==0&&year%100!=0||year%400==0){
            System.out.println("The year "+year+"is leap year");
            return;
        }
        System.out.println("The year "+year+"is not leap year");
    }
}
