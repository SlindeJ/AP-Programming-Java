package CS220.week10LAB;

public class Bird extends PolyAnimal{
	//Step-1: add a constructor with three parameters to initialize the x_coordinate, y_coordinate, and id
	public Bird(double x, double y, String id) {
		super(x, y, id);
	}
		//call Animal class constructor inside Bird constructor to complete this task

	
	//Step-1:add a constructor without parameter

	
	@Override
	public void move() {
		fly(5);
	}
	
	private void fly(double feet) {
		//call setX_coordinate() method, and setY_coordinate() method to update x_coordinate and y_coordinate by adding distance (# of feet) to x_coordinate, and y_coordinate
		setX_coordinate(getPosition()[0] + feet);
		setY_coordinate(getPosition()[1] + feet);
		double distance = Math.sqrt(feet*feet + feet*feet);
		System.out.printf("%s flew: %.1f feet.\n", this.getClass().getSimpleName(), distance);
	}
}


