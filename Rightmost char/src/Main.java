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
		String s = input.nextLine();
		int index = -1;
		char t = s.charAt(s.length()-1);
		String sentance = s.substring(0,s.length()-2);
		for(int i = 0;i<sentance.length();i++){
			if(t == sentance.charAt(i)){
				index = i;
			}
		}
		   System.out.println(index);
		 }
		}catch(Exception e){
			
		}
	}

}
