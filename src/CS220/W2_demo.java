
public class W2_demo {

	public static void main(String[] args) {
		//(1) use printf("format string", [arg1, arg2,...]) method
		//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/PrintStream.html#printf(java.lang.String,java.lang.Object...)
	    //see in Java_printf_method_quick_reference.pdf		
		int num = 3425;
 		double dblTotal = num * 5298.7;
 		String stringVal = "This is a test string, This is a test string.";
 		
 		//the format string may contain format placeholder(s) that always start from % mark
 		//%d means insert an integer here, which integer inserted depends on sequence of 
 		//the place holders in the format string, and the sequence of the args in the arguments list 
 		//%n and \n both means insert a line break
 		System.out.printf("num is: %d%n, it has %d digits.\n", num, Integer.toString(num).length());
 		
 		//%,.2f means insert a floating point number with , and two decimal places 
 		System.out.printf("Total is: $%,.2f%n", dblTotal); //output: Total is: $18,148,047.50
		
 		//20 means set up field width to 20 and right-align the data
 		System.out.printf("Total: %20.2f%n", dblTotal);//output:  Total:          18148047.50
 		
 		//-20 means set up field width to 20 and left-align the data
 		System.out.printf("Total: %-20.2f%n", dblTotal); //Total: 18148047.50
 		
 		//in "%d%n% d%n", the space added before 2nd d means leave a space for positive sign without display it 
 		System.out.printf("%d%n% d%n", -12345, 12345);
 		System.out.printf("%d%n%d%n", -12345, 12345); //without adding space before 2nd d in the placeholder
 		
 		// in "%20.10s%n", set up field with to 20 and .10s means display ten characters of the string data
 		/*System.out.printf("%20.10s%n", stringVal); //          This is a
 		System.out.printf("%20.15s%n", stringVal); //     This is a test 
 		System.out.printf("Scientific notation:%e\n", Math.PI);//Scientific notation:3.141593e+00
 		System.out.printf("Display PI=%.8f\n", Math.PI);//Display PI=3.14159265
 		System.out.printf("\nDis\tplay PI=%.8f\n\n", Math.PI);//\t means add a tab-space
 		*/
 		
 		for (int i= 0; i<20; i++) {
        	System.out.print("*\t");
        	if ( (i+1)%5 == 0 )
        		System.out.println(); //add a new line break; 
        }
      
 		//integer division
 		System.out.println("7.0/4.0 = " + 7.0/4.0);
 		System.out.println("7/4.0 = " + 7/4.0);
 		System.out.println("7.0/4 = " + 7.0/4);
 		System.out.println("7/4 = " + 7/4);
 		int num1 = 7, num2 = 4;
 		System.out.println("num1/num2 = " + num1/num2);
 		System.out.println("(double) num1/num2 = " + (double) num1/num2);
 		System.out.println("(double) (num1/num2) = " + (double) (num1/num2));
 		
 		//Use Modulus Operator % to get remainder
 		System.out.println("7 % 4 =" + 7 % 4); //remainder: 3
 		System.out.println("7.5 % 4 =" + 7.5 % 4); //remainder: 3.5
 		System.out.println("7.5 % 4.7 =" + 7.5 % 4.7); //remainder: 2.8
 		
 		
 		for (int i= 0; i<20; i++) {
        	if ( i%2 == 0 ) //get even numbers
        		System.out.println(i);
        }
        
 		int n = 10;
 		int m = (int)(Math.random()*1000); //generate random integer numbers between 0 and 1000
 		for (int i= 0; i<m; i++) {
 			System.out.println(i);
        	System.out.println(i%n); // the remainder will be an integer between 0 and n-1
        }

	}

}
