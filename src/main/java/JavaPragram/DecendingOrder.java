package JavaPragram;

public class DecendingOrder {

	public static void main(String[] args) {
		int a[] = { 1, 8, 9, 5, 45, 2, 5, 3, 12 };
		int lenght = a.length;
		int temp;
		for (int i = 0; i < lenght ; i++) {
			for (int j = i + 1; j < lenght; j++) {

				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}

		}

		for (int n : a) {
			System.out.println(n);

		}

	}

}
