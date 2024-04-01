import java.util.*; 

public class MSOE2015_7 {
    public static int triangular(int edge) {
        if (edge <= 1) { return edge; } 
        return edge + triangular(edge-1); 
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Please input the triangle edge length: ");
        int edge = input.nextInt(); 
        int num = triangular(edge); // don't even need???
        System.out.println("The 3 triangular numbers can be expressed as " + edge + " 0 0");
    }
}