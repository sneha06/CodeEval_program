public class Main {

	public static void main(String[] args) {
		int i;
		int num = 1;
		int sum = 0;
		int count = 0;
		while (count < 1000) {
			num++;
			boolean isprime = true;
			for (int j = 2; j < num; j++) {
				if (num % j == 0) {
					isprime = false;
					break;
				}
			}
			if (isprime) {
				sum += num;
				count++;
			}
		}
		System.out.println(sum);

	}
}
