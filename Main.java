import java.util.Scanner;
/**
 *A program that asks the user for a temperature in degrees Celsius and converts it into degrees Fahrenheit
 * @author Khazina
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Create a scanner for user input
    Scanner input = new Scanner(System.in);

   //Ask the user to enter a temperature they would like to convert in degrees Celsius
   System.out.println("Please enter a temperature you would like to convert in degrees Celsius.");

   //Get the users temperature input
   int tempInC = input.nextInt();

   //Declare and calculate the users converted temperature
   int tempInF = (tempInC*9)/5 +32;

   //Tell the user thier converted temperature in degrees Fahrenheit
   System.out.println(tempInC + "C" + " is the same as " + tempInF + "F");

  }
}
