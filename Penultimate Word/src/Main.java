import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {

		
		
			
			try {
				if(args.length!=1){
					System.exit(0);
				}
				File file = new File(args[0]);
				Scanner s = new Scanner(file);
			
			
			while (s.hasNextLine()) {

				String line = s.nextLine();
				String[] word = line.split(" ");
				String result = word[word.length - 2];
				System.out.println(result);
			}
	} catch (Exception e) {
		

		e.printStackTrace();
		

	}


	}}

