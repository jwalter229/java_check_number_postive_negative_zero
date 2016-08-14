/*write a program that takes an integer input from a user
and display if the number is positive, negitive, or 0
*/ 

//importing a scanner
   import java.util.Scanner;
   
//Name of the Class   
public class CheckNumber {
   
   //Main Method
   public static void main(String[] args) {
                   
      //creating a new scanner
      Scanner scanner = new Scanner(System.in);
            
      //prompting the user to enter the grade
      System.out.println("Enter a number: ");
      
      double num = scanner.nextDouble();
      
      String num_val = "";

      if (num > 0) {
         num_val = " is positive";//num greater than 0
      }  else if (num < 0) {
         num_val = " is negitive";//num less than 0
      }  else if (num == 0) {
         num_val = " is 0";//num is equal to 0
      }  else {
         num_val = " oops, logic fail...";  
      }
      
      System.out.println("The number is: " + (int)num + num_val);
         
   }//end of main block
}//end of class CheckNumber         
