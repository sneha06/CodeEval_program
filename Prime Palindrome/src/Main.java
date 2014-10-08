import org.omg.CORBA.PUBLIC_MEMBER;


public class Main {

	public static void main(String[] args){
		int max =0;
		int num = 1000;
		for(int i= 0;i<1000;i++){
			boolean isprime = true;
			 for(int j=2;j<i;j++){
				 if(i%j == 0){
					 isprime = false;
					 break;
				 }
			 }
			 if(isprime){
				 if(i==reversenum(i)){
				
					  max = Math.max(i, max);
				 }
				 
			 }
		}
		System.out.println(max);
		
	}
	public static int reversenum(int n){
	int	reminder =0;
	int	reverse =0;
		while(n>0){
			reminder = n%10;
			reverse = reverse*10+reminder;
			n=n/10;
		}
		return reverse;
	}
}
