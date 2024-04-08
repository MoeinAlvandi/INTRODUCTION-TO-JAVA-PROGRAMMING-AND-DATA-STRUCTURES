import java.util.Scanner;

public class Q3 {
	/*
	 * 4.3 (Geography: estimate areas) Use the GPS locations for Atlanta, Georgia;
	 * Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina in the
	 * figure in Section 4.1 to compute the estimated area enclosed by these four
	 * cities.
	 * (Hint: Use the formula in Programming Exercise 4.2 to compute the distance
	 * between two cities. Divide the polygon into two triangles and use the formula
	 * in
	 * Programming Exercise 2.19 to compute the area of a triangle.)	
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double erthRadios = 6371.01;

		// Charlotte (35.2270869, –80.8431267)
		// Savannah (32.0835407, –81.0998342)
		// Orlando (28.5383355, –81.3792365)
		// Atlanta (33.7489954, –84.3879824)

		double Charlottex = 35.2270869;
		double Charlottey = -80.8431267;
		double Savannahx = 32.0835407;
		double Savannahy = -81.0998342;
		double Orlandox = 28.5383355;
		double Orlandoy = -81.3792365;
		double Atlantax = 33.7489954;
		double Atlantay = -84.3879824;

		// CharlottetoSavannah = from Charlotte to Savannah
		// SavannahtoOrlando = from Savannah to Orlando
		// OrlandotoAtlanta = from Orlando to Atlanta
		// AtlantatoCharlotte = from Atlanta to Charlotte

		double CharlottetoSavannah = erthRadios * Math.acos(Math.sin(Math.toRadians(Charlottex)) * Math.sin(Math.toRadians(Savannahx))
				+ Math.cos(Math.toRadians(Charlottex)) * Math.cos(Math.toRadians(Savannahx))
						* Math.cos(Math.toRadians(Charlottey - Savannahy)));

		double SavannahtoOrlando = erthRadios * Math.acos(Math.sin(Math.toRadians(Savannahx)) * Math.sin(Math.toRadians(Orlandox))
				+ Math.cos(Math.toRadians(Savannahx)) * Math.cos(Math.toRadians(Orlandox))
						* Math.cos(Math.toRadians(Savannahy - Orlandoy)));

		double OrlandotoAtlanta = erthRadios * Math.acos(Math.sin(Math.toRadians(Orlandox)) * Math.sin(Math.toRadians(Atlantax))
				+ Math.cos(Math.toRadians(Orlandox)) * Math.cos(Math.toRadians(Atlantax))
						* Math.cos(Math.toRadians(Orlandoy - Atlantay)));

		double AtlantatoCharlotte = erthRadios * Math.acos(Math.sin(Math.toRadians(Atlantax)) * Math.sin(Math.toRadians(Charlottex))
				+ Math.cos(Math.toRadians(Atlantax)) * Math.cos(Math.toRadians(Charlottex))
						* Math.cos(Math.toRadians(Atlantay - Charlottey)));

		// we need a side that will be the base of the two triangles
		// it from Atlanta to Savannah

		double base = erthRadios * Math.acos(Math.sin(Math.toRadians(Atlantax)) * Math.sin(Math.toRadians(Savannahx))
				+ Math.cos(Math.toRadians(Atlantax)) * Math.cos(Math.toRadians(Savannahx))
						* Math.cos(Math.toRadians(Atlantay - Savannahy)));

		double s = (CharlottetoSavannah + AtlantatoCharlotte + base) / 2;
		double t1Area = (Math.sqrt(s * (s - CharlottetoSavannah) * (s - AtlantatoCharlotte) * (s - base)));

		s = (SavannahtoOrlando + OrlandotoAtlanta + base) / 2;
		double t2Area = (Math.sqrt(s * (s - SavannahtoOrlando) * (s - OrlandotoAtlanta) * (s - base)));
		System.out.println("The Area Is : " + (t1Area + t2Area) + " km"); // 117863.34165943446 km

	}
}