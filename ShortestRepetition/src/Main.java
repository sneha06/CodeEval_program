import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args){
		
		int count = 1;
		
		try{
			File file = new File(args[0]);
			
			Scanner in = new Scanner(file);
			
		while(in.hasNextLine()){
			String mString = in.nextLine();
			int count1 = find(mString);
			
			if(count1==-1){
				System.out.println(mString.length());
			}else{
				System.out.println(count1);
			}
		
		}}catch(Exception e){
			
		}
		
		
	}
	public static int find(String mString){
		int count = 1;
		for(int i = 0;i<=mString.length()-count;i++){
			String first = mString.substring(0, count);
			String second = mString.substring(count, count+count);
			if(first.equals(second))
			{
				return count;
			}
			count++;
			
		}
		return -1;
	}

	

}
