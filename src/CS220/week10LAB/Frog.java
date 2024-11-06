package CS220.week10LAB;

public class Frog extends PolyAnimal{
	
	    //step-1: a constructor with three parameters to initialize the x_coordinate, y_coordinate, and id
		public Frog(double x, double y, String id) {
			super(x, y, id);
		}
		//call Animal class constructor inside Frog constructor to complete this task
	
		
		//step-1: add a constructor without parameter
	
		
		@Override
		public void move() {
			jump(5);
		}
		
		private void jump(double feet) {
			//call setY_coordinate() method to update y_coordinate by adding distance (# of feet) to y_coordinate
			setY_coordinate(getPosition()[1] + feet);
			System.out.printf("%s jumped: %.1f feet.\n", this.getClass().getSimpleName(), feet);
		}
		
	}
