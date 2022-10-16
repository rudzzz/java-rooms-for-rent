import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Rent[] vector = new Rent[10];
		
		System.out.println("How many rooms will be rented? ");
		int rooms = scanner.nextInt();
		
		for(int i = 1; i <= rooms; i++) {
			System.out.println("\nRent #" + i + ":");
			System.out.println("Name:");
			scanner.nextLine();
			
			String name = scanner.nextLine();
			
			System.out.println("Email:");
			String email = scanner.next();
			
			System.out.println("Room:");
			int room = scanner.nextInt();
			
			vector[room] = new Rent(name, email);
		}
		
		System.out.println("\nBusy rooms: ");
		for(int i = 0; i < 10; i++) {
			if(vector[i] != null) {
				System.out.println(i + ": " + vector[i]);	
			}
		}
		
		
		scanner.close();
	}

}
