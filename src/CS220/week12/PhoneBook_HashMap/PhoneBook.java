package CS220.week12.PhoneBook_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class PhoneBook {
	// Step-1: define a private field which is a HashMap contains
	// String of phone number as the key, and ResidentPhone as the value
	private HashMap<String, ResidentPhone> phoneMap = new HashMap<>();
	// step-2, public method: addPhone
	public void addPhone(String phoneNum, String lname, String fname) {
		// add java code here
		phoneMap.put(phoneNum, new ResidentPhone(lname, fname, phoneNum));
	}

	// step-3:public method: searchPhone, return an ArrayList containing the phone
	// info
	// that matched search key
	public List<ResidentPhone> searchPhone(String search) {

		List<ResidentPhone> match_list = new ArrayList<>();
		// add java code here
		Set<String> phones = phoneMap.keySet(); // get all keys: all phone numbers
		for (String p : phones) {
			String fname = phoneMap.get(p).getFirstName();
			String lname = phoneMap.get(p).getLastName();
			if (fname.toLowerCase().startsWith(search.toLowerCase()) || lname.toLowerCase().startsWith(search.toLowerCase())) {

				match_list.add(phoneMap.get(p));
			}
		}
		return match_list;
	}

	// step-4: public method: print
	public void print() {
		// add a loop here to print out a list of resident phones by using HashMap.Entry
		// https://help.intrexx.com/apidocs/jdk17/api/java.base/java/util/HashMap.html#entrySet()
		for (HashMap.Entry<String, ResidentPhone> entry : phoneMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue().getFirstName() + " " + entry.getValue().getLastName());
		}
	}

}
