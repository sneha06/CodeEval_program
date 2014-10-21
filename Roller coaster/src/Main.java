import java.io.File;
import java.util.Scanner;
public class Main {

	public static void main(String[] args){
		if(args.length == 0){
			System.exit(0);
		}
		
		File file = new File(args[0]);
		try{
		Scanner in = new Scanner(file);
		while(in.hasNextLine()){
		String str = in.nextLine();
		  int count=0;  
		  
		  char s =' ';
		 
		for(int i=0;i<str.length();i++){
		 char c = str.charAt(i);
		 
		 if(c!=' '){    
		 	 
			if(count%2 == 0){
			 s = str.toUpperCase().charAt(i);
			System.out.print(s);
			count++;
			} else if(count%2 !=0){
				 s = str.toLowerCase().charAt(i);
				System.out.print(s);
				count++;
				}
		 }else{
			 System.out.print(c);
		 }
		}
		System.out.println();
		}
		} catch(Exception e){
			
		}
	}
}
