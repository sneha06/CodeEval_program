import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
     
	public static Boolean isLetter(char c){
		return(c<='z'&& c>='a');
	}
	public static Boolean isletter(char c){
		return(c<='Z'&&c>='A');
	}
	public static void main(String args[]){
		
		
		File file = new File(args[0]);
		
		
		try {
			Scanner in = new Scanner(file);
			String mString = in.nextLine();
			  
			String result = "";
			 for(int i=0;i< mString.length();i++){
				
				 char c = mString.charAt(i); 
				 
				 if(isLetter(c)){
					 result += Character.toUpperCase(c);
				 }else{
					 if(isletter(c)){
						 result += Character.toLowerCase(c);
						
					 }else{
						 result +=c;
					 }
				 }
			 }
			 System.out.print(result);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
}
