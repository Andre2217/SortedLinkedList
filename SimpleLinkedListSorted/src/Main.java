import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		LikedListSorted list = new LikedListSorted();
		Scanner input = new Scanner(System.in);

		int choice, number;
		do {
			System.out.println("1 - add");
			System.out.println("2 - Show the list");
			System.out.println("3 - take from beginning");
			System.out.println("4 - take from the end");
			System.out.println("0 - exit");
			System.out.println("pick an option");
			choice = input.nextInt();
			if (choice < 0 || choice > 4) {
				System.out.println("invalid option");
			} else {
				switch (choice) {
				case 1:
					System.out.println("What number go at the list?");
					number = input.nextInt();
					list.Add(number);
					break;
				case 2:
					if (list.first == null) {
						System.out.println("The list is empty");
					} else {
						list.Show();
					}
					break;
				case 3:
					if (list.first == null) {
						System.out.println("The list is empty");
					} else {
						list.takeFromBeginning();
					}
					break;
				case 4:
					if (list.first == null) {
						System.out.println("The list is empty");
					} else {
						list.takeFromEnd();
					}
					break;
				}
			}

		} while (choice != 0);
	}
}
