package input;

import java.util.Scanner;

// Task: calculate fuel consumption in litres per 100 km
// from total litres and kilometres driven (liter * 100 / km).
public class FuelConsumption {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Total liters used: ");
		double litersUsed = scanner.nextDouble();

		System.out.print("Kilometers driven: ");
		double kilometersDriven = scanner.nextDouble();

		double litersPer100Km = calculateConsumption(litersUsed, kilometersDriven);
		System.out.print("Consumption: " + litersPer100Km);

		scanner.close();
	}

	// calculates the fuel consumption in litres per 100 km
	public static double calculateConsumption(double litersUsed, double kilometersDriven) {
		if (litersUsed <= 0){
			throw new IllegalArgumentException("Liters must be greater than 0.");
		}
		if (kilometersDriven <= 0){
			throw new IllegalArgumentException("Kilometers must be greater than 0.");
		}
		double litersPer100Km = litersUsed * 100 / kilometersDriven;
		return litersPer100Km;
	}
}
