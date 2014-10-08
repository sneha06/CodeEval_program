import java.io.File;
import java.util.Scanner;
public class Main {
  public static void main(String[] args){
	  if(args.length!=1){
		  System.exit(0);
	  }
	  try{
	  File file = new File(args[0]);
	  Scanner in = new Scanner(System.in);
	  
	  while(in.hasNextLine()){
	  int num = in.nextInt();
	  
	  if(num%2 ==0){
		  System.out.println("1");
	  }
	  else{
		  System.out.println("0");
	  }
	  }}catch(Exception e){
		  
	  }
  }
}
