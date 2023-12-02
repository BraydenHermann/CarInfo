/*
 * Student Name: Brayden Hermann
 * Lab Professor: David Haley
 * Due Date: 2/3/2023
 * Modified: 2/2/2023
 * Description: Lab Exercise 2 - Car Class
 */
public class Car {
	// initialize variables
	private String VIN;
	private double mileage;
	private int year;
	private double invoicePrice;
	
	// constructors
	public Car(String VIN, double mileage, int year, double invoicePrice) {
		this.VIN = VIN;
		this.mileage = mileage;
		this.year = year;
		this.invoicePrice = invoicePrice;
	}
	public Car() {
		this.VIN = "";
		this.mileage = 0.0;
		this.year = 0;
		this.invoicePrice = 0.0;
	}
	
	// getters and setters
	public String getVIN() {
		return VIN;
	}
	public void setVIN(String VIN) {
		this.VIN = VIN;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getInvoicePrice() {
		return invoicePrice;
	}
	public void setInvoicePrice(double invoicePrice) {
		this.invoicePrice = invoicePrice;
	}
	
	// Get the VIN, mileage, invoicePrice and year of the Car
	@Override
	public String toString() {
		return System.out.printf("Car Information:\nVIN: %s\nMileage: %.1f km\nInvoice Price: $%.2f\nYear: %d", this.VIN, this.mileage, this.invoicePrice, this.year).toString();
	}
	
	
}
