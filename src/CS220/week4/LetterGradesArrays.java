

//Letter Grades using arrays example
import java.util.Arrays;
import java.util.Scanner;

public class LetterGradesArrays {
   public static void main(String[] args) {
      
	  //Step-1: get user input grades by calling getInputGrades() method 
     //int[] gradesArray= getInputGrades();
      int[] gradesArray = {100, 98, 44, 76, 81};
      //Step-2: check if gradesArray is empty, then
      // print out an error message "no grades entered!" and exit the entire program
       if (gradesArray.length == 0) {
           System.out.println("No grades entered!");
           System.exit(1);
       }
      
      //Step-3: define countGrades array by calling getGradesCount() method to create grade counters
      final char[] letterGrade = {'A', 'B', 'C', 'D', 'F'};
       int[] countGrades = getGradesCount(gradesArray, letterGrade);
      
      //Step-4: display grade report by calling displayReport() method
    //  displayReport(); //add arguments in method call
      
     
      //Step-5: sort grades in gradesArray
      System.out.println("before sorting: " + Arrays.toString(gradesArray));
      
      //Call Arrays.sort() method
      Arrays.sort(gradesArray);
      //System.out.println("after sorting: " + Arrays.toString(gradesArray));
      //Extra discussion: to get reversed order of elements in an array:  Collections.reverse(Arrays.asList(gradesArray));
       Arrays.sort(gradesArray);
       System.out.println("after reverse: " + Arrays.toString(gradesArray));
      
    /*  
      //Step-6: search grade in gradesArray
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter a grade that you want to search: ");
      int searchG = keyboard.nextInt();
      
      //call Arrays.binarySearch() method
      int index = 0;
      
      //if () 
    	  System.out.println("find that grade in the grades array, at gradesArray["+index+"]: " + gradesArray[index]);
      //else   
    	  System.out.println("Did not find that grade");
      
      keyboard.close(); 
     */
   } //end of the main method

  /**
   * getInputGrades: to get user input numerical grades
   * @return int[] a numerical grade array
   */
   public static int[] getInputGrades() 
   {
	   Scanner input = new Scanner(System.in);
       System.out.println("How many grades that you want to input? ");   
       int numGrades = input.nextInt();
   
       //step-1.1: define a scoreArray
       int[] scoreArray = new int[numGrades];
	   System.out.println("Enter " + numGrades + " grades, separate them by whitespace"); 
	   
	   //step-1.2: define a for loop to read grade 
	   //if input grade is not in the range 0-100, print out error message "invalid input!"
	   //and then exit the entire program
	   //otherwise, add input grade to scoreArray
	  for (int i = 0; i < numGrades; i++) {
          int grade = input.nextInt();
          if (grade < 0 || grade > 100) {
              System.out.println("Invalid input");
              System.exit(1);
          }
          scoreArray[i] = grade;
      }
      //step 1.3: return scoreArray
      return null;
   }
   
   /**
    * getGradesCount: to count grades in each grade range: A (90-100), B (80-89), C (70-79), D (60-69), F (<60)
    * @param gradesArray
    * @param letterGrade
    * @return
    */
   public static int[] getGradesCount(final int[] gradesArray, final char[] letterGrade)
   {   
	   //define a grade counter array: countGrades
	   int[] countGrades = new int[letterGrade.length]; // grade counters array
	   
	   //define a loop to count each numerical grade based on its equivalent letter grade 
	   // grade
       for (int grade : gradesArray) {
           switch (grade/10) {  // switch functionality should be pretty easy to understand from here (PS, I love JetBrains Software)
               case 9, 10 -> countGrades[0]++;
               case 8 -> countGrades[1]++;
               case 7 -> countGrades[2]++;
               case 6 -> countGrades[3]++;
               default -> countGrades[4]++;
           }
       }
	   //return countGrades array
	   return countGrades;
   }
   
   /**
    * displayReport:  print out: total and average grade, and grades distribution 
    * @param gradesArray
    * @param letterGrade
    * @param countGrades
    */
   public static void displayReport(int[] gradesArray, char[] letterGrade, int[] countGrades)
   {
	   System.out.printf("%nGrade Report:%n");
	   // calculate average of all grades entered
	   int total = 0;
	   for (int grade: gradesArray)
	   {
		   total += grade;
	   }
       double average = (double) total / gradesArray.length;  

       // output summary of results
       System.out.printf("Total of the %d grades entered is %d%n", 
          gradesArray.length, total);
       System.out.printf("Class average is %.2f%n", average);
       System.out.println("Number of students who received each grade:");
       
       for (int i=0; i<letterGrade.length; i++) {
          System.out.printf("%s: %d %s%n", 
            "Grade "+ letterGrade[i], countGrades[i], "*".repeat(countGrades[i]));  // display number of each grade counted
       } 
   }
   
}


