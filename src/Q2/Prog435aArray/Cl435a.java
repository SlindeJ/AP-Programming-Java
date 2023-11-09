package Q2.Prog435aArray;

public class Cl435a {
    private int vehicle_type_number;
    private int gate_number;
    private double factor; // cost factor depending on vehicle type
    private String vehicle_type_name; // name of vehicle for each type
    private double base_toll;
    private double total_cost;

    public Cl435a(int vType, int gNum) {
        vehicle_type_number = vType;
        gate_number = gNum;
        factor = 0;
        vehicle_type_name = "";
        base_toll = 0;
        total_cost = 0;
    }

    public void calc() { // gotta make the if statements that set the factor, vehicle name, toll, and calc cost
    }


}
