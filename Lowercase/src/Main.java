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
	   
	   for(int i = 0;i<s.length();i++){
		   char a = s.charAt(i);
		   if(a != ' '){
			   char result = Character.toLowerCase(a);
			   System.out.print(result);
		   }else {
			   System.out.print(a);
		   }
	   }
	   System.out.println();
	   }
	   }catch(Exception e){
		   
	   }
   }
}
