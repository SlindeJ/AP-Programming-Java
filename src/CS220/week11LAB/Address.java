package CS220.week11LAB;
import java.util.*;

public class Address //step-1: add declaration here to implement Comparable<T> interface
//https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html
{
    private String street;
    private int houseNumber;

    /**

     Constructs an address.

     @param aStreet the street name

     @param aHouseNumber the house number

     */

    public Address(String aStreet, int aHouseNumber)
    {
        street = aStreet;
        houseNumber = aHouseNumber;
    }

    public String toString()

    {

        return houseNumber + " " + street;

    }

//step-2: add implementation of the compareTo() method here

//First compare the street names, if the street names are the same,

//then compare the house numbers.

//The compareTo() method should return an integer and has one parameter that accepts an Address object as the argument

}
