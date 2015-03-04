import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
	
	
	 public  static void main(String[] args){

		 if(args.length != 1){
			 System.exit(0);
	        }
	        read(args[0]);
    
	    }

	    private static void read(String arg) {
	        File file = new File(arg);
	        try {
	            Scanner scanner = new Scanner(file);
	            while(scanner.hasNext()){
	                bit(scanner.nextInt());
	            }
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }
	    }

	    private static void bit(int s) {
	        int i =0;
	        String a = Integer.toBinaryString(s);
	        for(int j =0 ; j<a.length();j++){
	            if(a.charAt(j) == 1){
	                i++;
	            }
	        }
	      System.out.println(i);
	    }

}
