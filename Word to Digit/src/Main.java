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
		String input = in.nextLine();
		String[] s = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String[] num = input.split(";");
		
		for(int i =0;i<num.length;i++){
			
			for(int j = 0;j<s.length;j++){
				
				if(num[i].equals(s[j])){
					
					System.out.print(j);
					break;
				}
				
			}
			
		}
	  System.out.println("\n");
		}
		}catch(Exception e){
			
		}
	}

}
