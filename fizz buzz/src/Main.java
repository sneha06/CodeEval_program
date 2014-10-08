import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		if(args.length != 1){
			System.exit(0);
		}
		
		File file = new File(args[0]);
		try {
			Scanner input = new Scanner(file);

			while (input.hasNextLine()) {
				String line = input.nextLine();
				String[] split = line.split(" ");
				int first = Integer.parseInt(split[0]);
				int second = Integer.parseInt(split[1]);
				int third = Integer.parseInt(split[2]);

				for (int i = 1; i <= third; i++) {
					if (i % first == 0 && i % second == 0) {
						System.out.print("FB ");
					}
					if (i % first == 0 && i % second != 0) {
						System.out.print("F ");

					}
					if (i % first != 0 && i % second == 0) {
						System.out.print("B ");
					}
					if (i % first != 0 && i % second != 0) {
						System.out.print(i + " ");
					}

				}
				System.out.println();
			}
		} catch (Exception e) {

		}

	}
}
