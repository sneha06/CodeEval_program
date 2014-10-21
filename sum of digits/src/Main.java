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
		
		int num = 0,sum =0;
		num = Integer.parseInt(s);
		int n = 0;
		 
		 while(num >0){
			 n = num%10;
			 sum +=n;
			 num =num/10;
		 }
		System.out.println(sum);
		}
		}catch(Exception e){
			
		}
	}
}
