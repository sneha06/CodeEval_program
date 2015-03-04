import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		if(args.length == 0){
			System.exit(0);
		}
		
		//File file = new File("/home/sneha/workspace/Swap Element/src/tfile.txt");
		File file = new File(args[0]);
		try {

			
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				List<Integer> list = new ArrayList<Integer>();
				String line = scanner.nextLine();
				int index = line.indexOf(":");
				String beginning = line.substring(0, index);
				String ending = line.substring(index + 2);

				Scanner scanner1 = new Scanner(beginning);
				while (scanner1.hasNextInt()) {
					list.add(scanner1.nextInt());
				}

				Scanner scanner2 = new Scanner(ending);
				scanner2.useDelimiter(", ");
				while (scanner2.hasNext()) {
					String rng = scanner2.next();
					Scanner subscanner = new Scanner(rng);

					subscanner.useDelimiter("-");

					while (subscanner.hasNextInt()) {
						int index1 = subscanner.nextInt();
						int index2 = subscanner.nextInt();
						int temp = list.get(index1);
						list.set(index1, list.get(index2));
						list.set(index2, temp);

					}
				}
				for(int i =0 ; i<list.size(); i++){
					System.out.print(list.get(i)+ " ");
				}
				System.out.println();
				

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
		}

	}
}
