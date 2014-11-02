import java.io.File;
import java.util.Scanner;
public class Main {

	public static void main(String[] args){
		if(args.length == 0){
			System.exit(0);
		}
		
		File file = new File(args[0]);
		try{
			Scanner input = new Scanner(file);
			while(input.hasNextLine()){
				String line = input.nextLine();
				String[] s = line.split(",");
				int num1 = Integer.parseInt(s[0]);
				int num2 = Integer.parseInt(s[1]);
				int div = num1/num2;
				int mod = num1 - (num2 * div);
				System.out.println(mod);
			}
		}
		    catch(Exception e){
		    	
		    }
	}
}
