package sriiknth;
import java.util.Scanner; 
public class WindChill {
	
        public static void main(String[] args) { 
	    Scanner input = new Scanner(System.in);

	    // Tempurature
	    double temperature = input.nextDouble();
	    // Windspeed
	    double speed = input.nextDouble();
	    // Compute the wind chill tempurature
	    double windChill = 35.74 + 0.6215 * temperature -         
	                   35.75 * Math.pow(speed, 
	                           0.16) + 0.4275 * temperature * 
	                           Math.pow(speed, 0.16);

	    // Prompt the user to enter a temperature between -58F and 41F.
	    System.out.print("Enter the temperature in Fahrenheit " +
	    "between -58\u00b0F and 41\u00b0F: ");

	    // Prompt the user to enter the wind speed greter than or equal to 2.
	    System.out.print("Enter the wind speed (>= 2) in miles per hour: ");

	    // Display result
	    System.out.println("The wind chill tempurature is " + windChill);

	        }
	}	
