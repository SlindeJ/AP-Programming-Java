package Chem_Database.Periodic_Table;

public class Element {
    private String elementName;
    private String elementSymbol;
    private int periodicNum;
    private double molecularMass;

    public Element(String elementName, String elementSymbol, int periodicNum, double molecularMass) {
        this.elementName = elementName;
        this.elementSymbol = elementSymbol;
        this.periodicNum = periodicNum;
        this.molecularMass = molecularMass;
    }
}


// the idea is the have all info on in one question
// hopefully I will be able to use Math.Rand to give only one piece of information and the rest has to be deduced.
// I would also like to be able to keep track of how many element were gotten completely correct and how many had some wrong info
// required info:
// element name
// abbreviated element name/symbol
// periodic number
// molecular mass