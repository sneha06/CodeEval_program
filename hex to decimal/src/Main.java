import java.io.File;
import java.util.Scanner;
public class Main {
 
	public static void main(String args[]){
		
		try{
		File file = new File(args[0]);
		Scanner input = new Scanner(file);
		
		while(input.hasNextLine()){
		String hex = input.nextLine();
		
		int result = Integer.parseInt(hex, 16);
		System.out.println(result);
		}}catch(Exception e){
			
		}
		}
	}

