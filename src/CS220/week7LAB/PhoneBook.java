package CS220.week7LAB;

import java.util.ArrayList;

public class PhoneBook {
     //define a private field which is an ArrayList of ResidentPhone objects
	ArrayList<ResidentPhone> PhoneList = new ArrayList<ResidentPhone>();
     
     //public method: addPhone
     public void addPhone(String firstName, String lastName, String phoneNumber) {
         ResidentPhone r = new ResidentPhone(firstName, lastName, phoneNumber);
         PhoneList.add(r);
     }
     
     //public method: searchPhone
     public ArrayList<ResidentPhone> searchPhone(String key) {
         ArrayList<ResidentPhone> r = new ArrayList<>();
         for (ResidentPhone p : PhoneList) {
             if (p.getFirst_name().startsWith(key) || p.getLast_name().startsWith(key)) {
                 r.add(p);
             }
         }
         if (!r.isEmpty()) {
             return r;
         } else {
             return r;
         }
     }
     //public method: print
     public void print() {
         for (ResidentPhone p : PhoneList) {
             System.out.println(p.toString());
         }
     }
}
