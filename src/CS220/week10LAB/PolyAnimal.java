package CS220.week10LAB;

//step-2.1: modify PolyAnimal class as an abstract class
public abstract class PolyAnimal{
	//Define common attributes for all animals
	//(1) private instance variables: x_coordinate, y_coordinate to tell the location of each animal
	private double x_coordinate;   
	private double y_coordinate; 
	//(2) private instance variable: id to provide identifier for each animal object
    private String id;
	
	//Constructor with three parameters
	public PolyAnimal(double x, double y, String id) {
		x_coordinate = x;
		y_coordinate = y;
		this.id = id;
	}
   
	//constructor without parameter (i.e., default constructor)
	public PolyAnimal() {
	  //call the constructor with three parameters to initialize instance variables
	   this(0, 0, "");
	}

	//Step-2.2: modify the move() method to be an abstract method
	//add abstract keyword, delete the method body, add semicolon(;) to end the statement
	public abstract void move();
//	{
//		++x_coordinate;
//		++y_coordinate;
//
//		System.out.printf("%s moved %.1f feet\n", this.getClass().getSimpleName(), 2.0 );
//	}
	
	public String getId() {
		return id;
	}
	/**
	 * getPosition: get current position of an animal 
	 * @return x_coordinate and y_coordinate: double[]
	 */
	public double[] getPosition() {
		return new double[] {x_coordinate, y_coordinate};
	}
	
	public void setX_coordinate(double x) {
		x_coordinate = x;
	}
	
	public void setY_coordinate(double y) {
		y_coordinate = y;
	}
	
	
	//Step-3: develop a method named distanceFrom() that returns the distance between current animal and another animal passed in as an argument
	//the distance is calculated by: square root of ((x1-x2)^2 + (y1-y2)^2)
	//Hint: use getPosition() method to get x_coordinate and y_coordinate from each animal object instance
	public double getDistanceFrom(PolyAnimal a, PolyAnimal b) {
		double[] c = a.getPosition();
		double[] d = b.getPosition();
		return Math.sqrt(Math.pow(c[0] - d[0], 2) + Math.pow(c[1] - d[1], 2));
	}
	public double distanceFrom(PolyAnimal a) {
		double distance = 0;
	    
		return distance;
	}
	
	//toString() method to print out each animal info including its position and id
	public String toString() {
		String animalInfo = String.format("%s with id=\"%s\" at position(%.1f, %.1f) ", this.getClass().getSimpleName(), id, x_coordinate, y_coordinate); 
	    return animalInfo;
	}
	
}
