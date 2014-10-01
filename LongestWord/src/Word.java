import java.util.Scanner;

public class Word {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		s=s+" ";
		int len = s.length();
		String x="",maxw="",minw="";
		char ch;
		int p,maxl=0,minl=len;
		for(int i=0;i<len;i++){
			ch= s.charAt(i);
			if(ch!=' '){
				x=x+ch;
			}else {
				p=x.length();
				if(p<minl){
					minl=p;
					minw=x;
				}
				if(p>maxl){
					maxl=p;
					maxw=x;
				}
				x="";
			}
			
			
		}
		System.out.println("Shortest Word "+minw);
		System.out.println("Longest Word "+maxw);
	}

}
