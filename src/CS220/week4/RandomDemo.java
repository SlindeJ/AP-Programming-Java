

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
	    
	   }
	}

