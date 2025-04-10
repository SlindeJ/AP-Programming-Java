package CS223.Assignment_5;

import java.util.ArrayList;
import java.util.LinkedList;

public class Hashtable {
	// DO NOT MODIFY
	private final int tableSize;
	private final ArrayList<LinkedList<Integer>> table;
	private int count;

	public Hashtable(int tableSize) {
		this.tableSize = tableSize;
		table = new ArrayList<>(tableSize);

		for (int i = 0; i < tableSize; i++) {
			table.add(new LinkedList<>());
		}
	}

	public int getCount() {
		return count;
	}
	// END DO NOT MODIFY

	private int computeHash(int key) { return (37*key + 61)%tableSize; }

	public boolean insert(int key) {
		if (search(key)) { return false; }
		int hash = computeHash(key);
		LinkedList<Integer> list = table.get(hash);
		if (list == null) {
			list = new LinkedList<>();
			table.add(hash, list);
		}
		list.add(key);
		count++;
		return true;
	}

	public boolean remove(int key) {
		int hash = computeHash(key);
		LinkedList<Integer> list = table.get(hash);
		if (list == null) {
			return false;
		}
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == key) {
				list.remove(i);
				count--;
				return true;
			}
		}
		return false;
	}

	public boolean search(int key) {
		int hash = computeHash(key);
		LinkedList<Integer> list = table.get(hash);
		if (list == null) {
			return false;
		}
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == key) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < tableSize; i++) {
			str += "Slot " + i + ": ";
			LinkedList<Integer> list = table.get(i);
			if (list != null) {
				for (int j = 0; j < list.size(); j++) {
					str += list.get(j) + " ";
				}
				str += "\n";
			}
		}
		return str + "\n";
	}
}
