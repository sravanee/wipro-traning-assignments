import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Operations dictionary = new Operations();
		
		int choice = 0;
		String item;
		int index;
		
		do {
			System.out.println("MAIN MENU");
			System.out.println("---------");
			System.out.println("1. Insert");
			System.out.println("2. Search");
			System.out.println("3. Delete");
			System.out.println("4. Display");
			System.out.println("5. Exit");
			System.out.print("Enter your choice (1..5): ");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			case 1:
				System.out.print("Enter the item to be inserted: ");
				
				if (dictionary.insert(sc.nextLine()))
					System.out.println("Inserted successfully.");
				else
					System.out.println("Already exists.");
				break;
				
			case 2:
				System.out.print("Enter the item to search: ");
				if (dictionary.search(sc.nextLine()))
					System.out.println("Item found in the list.");
				else
					System.out.println("Item not found in the list.");
				break;
				
			case 3:
				System.out.print("Enter the item to delete: ");
				if (dictionary.delete(sc.nextLine()))
					System.out.println("Deleted successfully.");
				else
					System.out.println("Item does not exist.");
				break;
				
			case 4:
				System.out.println("The Items in the list are: ");
				dictionary.display();
				break;
				
			case 5:
				System.out.println("Exiting. . . Thanks for using the application!!");
			}
			
		} while (choice != 5);
		
		sc.close();
	}
}
