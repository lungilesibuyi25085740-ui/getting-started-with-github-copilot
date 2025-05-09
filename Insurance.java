
import java.util.Scanner;
public class Insurance { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in);

// Enter user for the current year and birth year 
System.out.print("Enter the current year: "); 
int currentYear = scanner.nextInt(); 
System.out.print("Enter your birth year: ");
int birthYear = scanner.nextInt();

// Calculate the age 
int age = currentYear - birthYear; 
// Calculate the decade of the age
int decade = age / 10; 
// Calculate the premium 
int premium = (decade + 15) * 20;
// Display the premium amount 
System.out.println("Your annual insurance premium is: $" + premium); 
scanner.close(); 
} 
  } 
