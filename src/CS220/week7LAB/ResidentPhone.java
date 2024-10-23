package CS220.week7LAB;

public class ResidentPhone {
	//add private fields:
    private String last_name, first_name, phone_number;
	
    
    //default constructor
    public ResidentPhone() {
        last_name = "";
        first_name = "";
        phone_number = "";
    }
    //constructor with three parameters
    public ResidentPhone(String first_name, String last_name, String phone_number) {
        this.last_name = last_name;
        this.first_name = first_name;
        this.phone_number = phone_number;
    }

    //public method: getFirstName
     public String getFirst_name() { return first_name; }
	 //public method: setFirstName
     public void setFirst_name(String first_name) { this.first_name = first_name; }
	//public method: getLastName
     public String getLast_name() { return last_name; }
	 //public method: setLastName
	 public void setLast_name(String last_name) { this.last_name = last_name; }
	 //public method: getPhoneNumber
	 public String getPhone_number() { return phone_number; }
	 //public method: setPhoneNumber
	 public void setPhone_number(String phone_number) { this.phone_number = phone_number; }
	 //public method: toString
    public String toString() {
        return last_name + "," + first_name + "," + phone_number;
    }
}
