import java.util.Scanner;
public class metric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double meters = 0;
        double miles, feet, inches;

        System.out.println("Enter measurement in meters: ");
        if(sc.hasNextDouble()){
            meters = sc.nextDouble();
        }else{
            System.out.println("Invalid input. Please re-run the program with a valid input.");
            System.exit(0);
        }

        miles = meters * 0.00062137;
        feet = meters * 3.281;
        inches = meters * 39.37;

        System.out.println(meters + "m is " + miles + "mi, " + feet + "ft and " + inches + "in.");
    }
}