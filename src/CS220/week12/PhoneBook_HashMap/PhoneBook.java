package CS220.week12.PhoneBook_HashMap;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
	// Step-1: define a private field which is a HashMap contains
	// String of phone number as the key, and ResidentPhone as the value

	// step-2, public method: addPhone
	public void addPhone(String phoneNum, String lname, String fname) {
		// add java code here

	}

	// step-3:public method: searchPhone, return an ArrayList containing the phone
	// info
	// that matched search key
	public List<ResidentPhone> searchPhone(String search) {

		List<ResidentPhone> match_list = new ArrayList<>();
		// add java code here

		return match_list;
	}

	// step-4: public method: print
	public void print() {
		// add a loop here to print out a list of resident phones by using HashMap.Entry
		// https://help.intrexx.com/apidocs/jdk17/api/java.base/java/util/HashMap.html#entrySet()

	}

}
