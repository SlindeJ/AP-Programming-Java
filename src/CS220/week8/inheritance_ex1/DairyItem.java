package CS220.week8.inheritance_ex1;

public class DairyItem extends ProduceItem{
    private String percentageFat;
    final private static int UNITS = 12;

    // add constructor
    public DairyItem(String name, int quantity, String expirationDate, String percentageFat) {
        setName(name);      // setName() method defined in the superclass: Generic Item
        setQuantity(quantity);      // this.setQuantity would call the one in this class, while super.setQuantity would call from the superclass method
        setExpiration(expirationDate);
        this.percentageFat = percentageFat;
    }

    @Override
    public void setQuantity(int quantity) {
        super.setQuantity(quantity*UNITS);      // reuse the setQuantity method
    }

    public String toString() {
        return String.format("%s\n%s\n%s\n", this.getClass().getSimpleName(), super.toString(), percentageFat);
    }
}
