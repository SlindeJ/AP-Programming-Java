//package CS220.week8.bicycle;
//// Java program to illustrate the
//// concept of inheritance
//import Bicycle;
//import MountainBike;
//
//public class BicycleTest {
//	public static void main(String args[])
//	{
//
//		MountainBike mb = new MountainBike(3, 100, 25);
//		System.out.println(mb.toString());
//		System.out.println(mb);  //toString() method is automatically called
//
//        //write java code to speed up the mountain bike by increasing speed by 5, and show the speed
//
//		//write java code to display current speed of the mountain bike
//
//
//		//write java code to add one gear to the mountain bike
//
//
//		//write java code to stop the mountain bike, and print out mountain bike information again.
//
//
//	}
//}
//
//
//// base class (super class)
//class Bicycle {
//	// the Bicycle class has two fields
//	private int gear; //private field
//	private int speed;  //private field
//
//	// the Bicycle class has one constructor
//	public Bicycle(int gear, int speed)
//	{
//		this.gear = gear;
//		this.speed = speed;
//	}
//
//	// the Bicycle class has 6 methods: getSpeed, applyBrake, speedUp, getGear, setGear, and toString
//	public int getSpeed() {
//		return speed;
//	}
//
//	public void applyBrake(int decrement)
//	{
//		speed = (speed > decrement) ? speed- decrement : 0;
//
//	}
//
//	public void speedUp(int increment)
//	{
//		speed += increment;
//	}
//
//	public int getGear(){
//		return gear;
//	}
//
//	public void setGear(int gear){
//		this.gear = gear;
//	}
//
//	// toString() method to print info of Bicycle
//	public String toString()
//	{
//		return ("No of gears are " + gear + "\n"
//				+ "speed of bicycle is " + speed);
//	}
//
//	//Add a method to stop bike (i.e., reduce speed to zero)
//
//
//}
//
//// derived class (subclass)
//class MountainBike extends Bicycle {
//
//	// the MountainBike subclass adds one more field
//	public int seatHeight;
//
//	// the MountainBike subclass has one constructor
//	public MountainBike(int gear, int speed,
//						int startHeight)
//	{
//		// invoking base-class(Bicycle) constructor
//		super(gear, speed); //must call super class constructor with arguments first
//		seatHeight = startHeight;
//	}
//
//	// the MountainBike subclass adds one more method
//	public void setHeight(int newValue)
//	{
//		seatHeight = newValue;
//	}
//
//	// overriding toString() method
//	// of Bicycle to print more info
//	@Override  //@Override is used to tell compiler this is an overriding method
//	public String toString()
//	{
//		return (super.toString() + "\nseat height is "
//				+ seatHeight);
//	}
//
//}
//
//

