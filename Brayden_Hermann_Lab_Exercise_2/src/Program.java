import java.util.Scanner;

/*
 * Student Name: Brayden Hermann
 * Lab Professor: David Haley
 * Due Date: 2/3/2023
 * Modified: 2/2/2023
 * Description: Lab Exercise 2 - Program Class
 */
public class Program {

	public static void main(String[] args) {
		/*
		start
		    declarations
		         String vehicleIdentificationNumber
		         num mileage
		         String vehicleYear
		         num invoicePrice
		         Car car
		         String report
		
		    output "Please enter vehicle identification number: "
		    input vehicleIdentificationNumber
		    car.setVehicleIdentificationNumber(vehicleIdentificationNumber)
		
		    output "Please enter mileage (km): "
		    input mileage
		    car.setMileage(mileage)
		
		   output “Please enter vehicle year: ”
		input vehicleYear
		car.setYear(vehicleYear)
		
		    output "Please enter invoice price: "
		    input invoicePrice
		    car.setInvoicePrice(invoicePrice)
		
		    report = car.toString()
		    output report
		    output "Program by Student Name" // replace Student Name with your full name
		stop
		*/
		Scanner input = new Scanner(System.in); // initialize scanner for user input
		Car car = new Car(); // create new Car object
		
		System.out.println("Please enter vehicle identification number: "); // prompt user to enter VIN
		car.setVIN(input.next()); // set the car's VIN to the value entered
		
		System.out.println("Please enter mileage(km): "); // prompt user to enter mileage
		car.setMileage(input.nextDouble()); // set the car's mileage to the value entered
		
		System.out.println("Please enter year: "); // prompt user to enter year
		car.setYear(input.nextInt()); // set the car's year to the value entered
		
		System.out.println("Please enter invoice price "); // prompt user to enter invoice price
		car.setInvoicePrice(input.nextDouble()); // set the car's invoice price to the value entered
		
		car.toString(); // get and print the car's information for the user
		System.out.println("\nProgram by Brayden Hermann");
		
	}

}
