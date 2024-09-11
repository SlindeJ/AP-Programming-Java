//Note-3: a java file can contain one and only one public class, all other classes in the same file can not be public.
package CS220.week2;



public class Test {  //public class
	public static void print() { //public static method
		System.out.println("Hello World, from public Test class!");
	}

}

class Test2 { //this class has default access level: accessible only in the same package 
	public static void print() {
		System.out.println("Programming is fun! from package-level Test2 class!");
	}

}
