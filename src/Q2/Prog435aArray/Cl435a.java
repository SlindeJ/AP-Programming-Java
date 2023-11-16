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
        if (vehicle_type_number == 1) {
            factor = 1;
            vehicle_type_name = "Compact Car";
        } else if (vehicle_type_number == 2) {
            factor = 1.3;
            vehicle_type_name = "Small Car";
        } else if (vehicle_type_number == 3) {
            factor = 1.6;
            vehicle_type_name = "Mid Size Car";
        } else if (vehicle_type_number == 4) {
            factor = 2.0;
            vehicle_type_name = "Full size Car";
        } else if (vehicle_type_number == 5) {
            factor = 2.4;
            vehicle_type_name = "Truck";
        } else if (vehicle_type_number == 6) {
            factor = 2.7;
            vehicle_type_name = "16 Wheeler";
        }
        if (gate_number == 1) {
            base_toll = 1.35;
        } else if (gate_number == 2) {
            base_toll = 2.00;
        }else if (gate_number == 3) {
            base_toll = 2.00;
        }else if (gate_number == 4) {
            base_toll = 2.00;
        }else if (gate_number == 5) {
            base_toll = 2.00;
        }else if (gate_number == 6) {
            base_toll = 2.00;
        }else if (gate_number == 7) {
            base_toll = 2.00;
        }else if (gate_number == 8) {
            base_toll = 2.00;
        }
        // math with set values down here

    }
}
