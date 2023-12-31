package Q2.Prog214bArray;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog214b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog214b.dat")); // remember to replace with new data file
            double[] employee = new double[100];
            int count = 0;

            while (input.hasNext()) {
                double numploy = input.nextFloat();
                employee[count] = numploy;
                count++;
            }
            for (int lcv = 0; lcv < count; lcv+=5) {
                int employID = (int)employee[lcv];  // don't need ID in helper and kind of redundant
                double YTDPay = employee[lcv+1];
                double bPay = employee[lcv+2];
                double sCode = employee[lcv+3];
                double hWorked = employee[lcv+4];
                Cl214b helper = new Cl214b(YTDPay, bPay, sCode, hWorked);
                helper.calc();
                System.out.println("Employee Number " + employID);
                helper.printFString();
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Employee Number 1001
Hours: 34.50  Rate: 4.50  Shift Factor: 1.25
			Current		Year-to-date
Gross Pay:	 194.06		1056.10
Withholding:   23.29
FICA:		11.74
Net Pay:	159.03
Employee Number 1002
Hours: 25.00  Rate: 3.25  Shift Factor: 1.00
			Current		Year-to-date
Gross Pay:	 81.25		3970.00
Withholding:   81.25
FICA:		4.92
Net Pay:	-4.92
Employee Number 1003
Hours: 30.00  Rate: 4.00  Shift Factor: 1.00
			Current		Year-to-date
Gross Pay:	 120.00		12485.50
Withholding:   9.60
FICA:		7.26
Net Pay:	103.14
Employee Number 1004
Hours: 38.50  Rate: 5.25  Shift Factor: 1.50
			Current		Year-to-date
Gross Pay:	 303.19		15587.40
Withholding:   53.06
FICA:		18.34
Net Pay:	231.79
Employee Number 1005
Hours: 40.00  Rate: 6.25  Shift Factor: 1.00
			Current		Year-to-date
Gross Pay:	 250.00		17188.50
Withholding:   37.50
FICA:		0.00
Net Pay:	212.50
Employee Number 1006
Hours: 48.00  Rate: 8.95  Shift Factor: 1.50
			Current		Year-to-date
Gross Pay:	 644.40		19109.40
Withholding:   112.77
FICA:		0.00
Net Pay:	531.63
Employee Number 1007
Hours: 35.00  Rate: 5.00  Shift Factor: 1.50
			Current		Year-to-date
Gross Pay:	 262.50		15600.00
Withholding:   39.38
FICA:		15.88
Net Pay:	207.24
 */