import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

 
public class Main {
   
	public static void main(String[] args)
	{
		if(args.length == 0){
			System.exit(0);
		}
		
		int a=0,sum=0;
		File file = new File(args[0]);
		try {
			Scanner input = new Scanner(file);
			while(input.hasNextLine()){
				String s = input.nextLine();
				 a = Integer.parseInt(s);
				 sum +=a;
			}
			System.out.print(sum);
						
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
}
