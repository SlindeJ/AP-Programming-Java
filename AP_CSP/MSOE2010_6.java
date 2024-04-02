import java.util.*; 

public class MSOE2010_6 {
    // public int summation(int verts, int x, int y) {
    //     if (verts == 1) { return }
    // }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("How many vertices are there? "); 
        int vertices = input.nextInt(); 
        int[][] mat = new int[2][vertices]; 
        for (int i = 0; i < vertices; i++) {
            System.out.print("Please enter the x coordinate of vertice " + (i+1) + ": "); 
            int x = input.nextInt();
            System.out.print("Please enter the y coordinate of vertice " + (i+1) + ": ");  
            int y = input.nextInt(); 
            mat[0][i] = x; 
            mat[1][i] = y; 
        }
        int area = 0; 
        for (int i = 0; i < vertices-1; i++) {
            area += mat[0][i] * mat[1][i+1] - mat[0][i+1] * mat[1][i]; 
        }
        area += mat[0][0] * mat[1][0+1] - mat[0][0+1] * mat[1][0]; 
        System.out.println("Number: " + (double)area/2);
    }
}
/*
How many vertices are there? 
3
Please enter the x coordinate of vertice 1: 0
Please enter the y coordinate of vertice 1: 0
Please enter the x coordinate of vertice 2: 3
Please enter the y coordinate of vertice 2: 0
Please enter the x coordinate of vertice 3: 3
Please enter the y coordinate of vertice 3: 4
Number: 6.0
*/

