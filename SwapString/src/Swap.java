import java.util.Scanner;
class Swap {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in); 
		 System.out.println("Enter value of a");
		 String a = s.nextLine();
		 System.out.println("Enter value of b");
		 String b = s.nextLine();
		 String temp = a;
		 a=b;
		 b=temp;
	     System.out.println("a ="+a);
        System.out.println("b ="+b);
        
	}

}
