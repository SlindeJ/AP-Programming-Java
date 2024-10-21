package CS220.week8.inheritance_ex1;
import java.time.LocalDate;
public class MainTest {

	public static void main(String[] args) {
		//create object instance of GenericItem called genericItem
        //call all the methods to set up the object and print that object info
		GenericItem newItem = new GenericItem();
		newItem.printItem();
		
		//create object instance of ProduceItem called milks
		//set expiration date by using LocalDate object and methods
		//https://docs.oracle.com/javase/tutorial/datetime/iso/date.html
		//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/LocalDate.html
		
		//call all the methods to set up the object and print that object info
		
		ProduceItem milks = new ProduceItem();
		milks.printItem();
		milks.printProduct();
		System.out.println(milks);	// call toString() method

		milks.setName("milk");
		milks.setQuantity(10);
		LocalDate dateOfProduction = LocalDate.of(2023, 9, 13);
		LocalDate dateOfExpiration = dateOfProduction.plusMonths(1).plusDays(5);
		milks.setExpiration(dateOfExpiration.toString());

		System.out.println(milks);

		DairyItem cheese = new DairyItem("cheese", 10, dateOfExpiration.toString(), "2%");
		System.out.println(cheese);

	}

}

