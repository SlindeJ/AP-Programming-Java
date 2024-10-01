import java.util.Random;
import java.util.*;
/**
	   This program prints ten random numbers by using Math.random() method
	   https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Math.html#random()
When Math.random() is first called, it creates a single new pseudorandom-number generator, 
exactly as if by the expression new java.util.Random()
	*/
	public class RandomDemo
	{
	   public static void main(String[] args)
	   {  
	     //generate 10 floating-point random numbers between 0 and 1
		  for (int i = 1; i <= 10; i++)
	      {  
	         double r = Math.random(); 
	         System.out.println(r);
	      }
	      
	      //generate 10 integer random numbers within a range [min, max] (e.g., [1,6])
		  int min = 1, max = 6; 
	      for (int i = 1; i <= 10; i++)
	      {  
	         int die = (int) (Math.random()*(max- min + 1)) + min; // (int) Math.random()*(max - min + 1) + min
	         System.out.print(die + "\t");
	      }
	      System.out.println();

		  //
		   int times = 10;
		   Random rGenerator = new Random();
		   int[] die1 = new int[times], die2 = new int[times];
		   for (int i = 0; i < times; i++) {
			   die1[i] = rGenerator.nextInt(6) + 1;
			   die2[i] = rGenerator.nextInt(6) + 1;
		   }
		   System.out.println("Die1: " + Arrays.toString(die1));
		   System.out.println("Die2: " + Arrays.toString(die2));

		   int[] countForDie1 = new int[6];
		   int[] countForDie2 = new int[6];

		   // count frequency
		   for (int i = 0; i < times; i++) {
			   countForDie1[die1[i]-1]++; // get the face number from die1 and die2
			   countForDie2[die2[i]-1]++;
		   }
		   System.out.printf("\n%7s%10s%10s\n", "face", "Die1count", "Die2count");
		   for (int i = 0; i < 6; i++) {
			   System.out.printf("\n%7d%10d%10d\n", (i+1), countForDie1[i], countForDie2[i]);
		   }
	   }
	}

