/** This class demonstrates static methods
 */
public class Metric {
	
	/** The milesToKilometers method converts a 
	 * distance in miles to kilometers
	 * @param m The distance in miles
	 * @return The distance in kilometers
	 */
	public static double milesToKilometers (double m)
	{ return m * 1.609; }
	
	public static double kilometersToMiles (double k)
	{
		return k/1.609;
	}

}


