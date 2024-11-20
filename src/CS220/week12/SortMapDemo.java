package CS220.week12;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortMapDemo {

	public static void main(String[] args) {

		Map<String, String> unsortedMap = new HashMap<>();

		unsortedMap.put("key_b", "banana");
		unsortedMap.put("key_a", "apple");
		unsortedMap.put("key_c", "orange");
		unsortedMap.put("key_e", "strawberry");
		unsortedMap.put("key_d", "blueberry");
		unsortedMap.put("key_f", "plum");

		System.out.println("unsorted map: " + unsortedMap);

		// Method-1: Convert HashMap to a TreeMap, which automatically sort a HashMap by
		// its keys
		// Requires the keys implement Comparable interface
		// here the keys are String variables, String implements Comparable interface
		// and compareTo() method
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html#compareTo(java.lang.String)
		Map<String, String> sortedMap = new TreeMap<>();
		sortedMap.putAll(unsortedMap); // sort data in unsortedMap by the keys (here keys are strings, use String's
										// compareTo() method
		System.out.println("sorted map: " + sortedMap);

		// Method-2: Convert Map to a List of Entries and then use Collections.sort()
		// method
		Map<String, String[]> unsortedPhoneMap = new HashMap<>();
		unsortedPhoneMap.put("6087123456", new String[] { "Baker", "Bob" }); // last name, first name
		unsortedPhoneMap.put("6086712345", new String[] { "Smith", "Pei" });
		unsortedPhoneMap.put("6089331421", new String[] { "Smith", "Morgan" });
		unsortedPhoneMap.put("5191234567", new String[] { "Smith", "William" });
		unsortedPhoneMap.put("9207994561", new String[] { "Java", "Program" });
		unsortedPhoneMap.put("9204321560", new String[] { "James", "Jean" });
		unsortedPhoneMap.put("9207994561", new String[] { "Harison", "Rose" });
		unsortedPhoneMap.put("5195589083", new String[] { "Andson", "Janne" });
		for (String key : unsortedPhoneMap.keySet()) {
			System.out.println("unsorted phone map: " + key + ": " + Arrays.toString(unsortedPhoneMap.get(key)));
		}

		// version-1: sort keys alone, and then use sorted keys to find values
		List<String> phoneNumbers = new ArrayList<>(unsortedPhoneMap.keySet());
		Collections.sort(phoneNumbers);
		System.out.println("\nsorted phone map (version-1): ");
		for (String s : phoneNumbers) {
			System.out.println(s + ": " + Arrays.toString(unsortedPhoneMap.get(s)));
		}

		// version-2: get Map entries, and then create a list to hold all Map entries.
		// can sort by keys or by values
		List<Entry<String, String[]>> phoneEntries = new ArrayList<>(unsortedPhoneMap.entrySet());
		Collections.sort(phoneEntries, new Comparator<Entry<String, String[]>>() {
			@Override
			public int compare(Entry<String, String[]> e1, Entry<String, String[]> e2) {

				// return
				// (e1.getValue()[0]+e1.getValue()[1]).compareTo(e2.getValue()[0]+e2.getValue()[1]);
				// //sort by the (last_name + first_name) ascending
				return (e2.getValue()[0] + e2.getValue()[1]).compareTo(e1.getValue()[0] + e1.getValue()[1]); // sort by
																												// the
																												// (last_name
																												// +
																												// first_name)
																												// descending
				// return e1.getKey().compareTo(e2.getKey()); //sort by the keys (phone numbers)
			}
		}
		/*
		 * (e1, e2)->
		 * (e1.getValue()[0]+e1.getValue()[1]).compareTo(e2.getValue()[0]+e2.getValue()[
		 * 1])
		 * 
		 */
		);
		System.out.println("\nsorted phone map (version-2): ");
		for (Entry<String, String[]> e : phoneEntries) {
			System.out.println(Arrays.toString(e.getValue()) + ": " + e.getKey());
		}

	}
}
