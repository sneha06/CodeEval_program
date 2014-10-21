
public class Main {

	public static void main(String[] args)
	{
		int[][] a = new int[12][12];
		for(int i=0;i<12;i++){
		 int j;	
		 System.out.print("");
			for( j = 0;j<12;j++){
				
				a[i][j]= (i+1)*(j+1);
				System.out.print(a[i][j]+"\t");
			}
			System.out.print("\n");
		}
		

	} 
}
