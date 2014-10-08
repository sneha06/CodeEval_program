import java.io.File;
import java.util.Scanner;
import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			Scanner input = new Scanner(file);

			while (input.hasNextLine()) {
				String s = input.nextLine();
				s = s + " ";
				int len = s.length();
				String x = "", maxw = "";
				char ch;
				int p, maxl = 0;
				for (int i = 0; i < len; i++) {
					ch = s.charAt(i);
					if (ch != ' ') {
						x = x + ch;
					} else {
						p = x.length();

						if (p > maxl) {
							maxl = p;
							maxw = x;

						}

						x = "";
					}

				}
				System.out.println(maxw);
			}
		} catch (Exception e) {

		}

	}

}
