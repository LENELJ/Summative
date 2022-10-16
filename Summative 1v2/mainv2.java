package mainv2;

import java.util.Scanner;

public class mainv2 {
	
	public static int idNumber = 1;
	public static int maxDevs = 1;
	public static int maxPMs = 1;
	public static Developer[] developer = new Developer[5];
	public static ProjectManager PM = new ProjectManager("");
	public static Boolean isLoggedIn = false;
	
	public mainv2() {
		Developer[] developer = null;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("TODO LIST");
		int response = 3;
		
		
		while(response != 0) {
			System.out.println("[1] Register | [2] Login | [0] Exit");
			System.out.print("Response: ");
			response = s.nextInt();
			s.nextLine();
			if(response == 1) {
				registerUser();
			}else if(response == 2) {
					login();
			}else {
				break;
			}
		}
		
		System.out.print(isLoggedIn);
		
		if(isLoggedIn) {
			// do task here
		}
		
	

	
	}
	
	public static void registerUser() { 
		// Registration method by Clever:
		// Registers the user and add it to the developer array.
		// It will only add a user if an array index is empty
		// It doesn't allow username duplicates
		// Max of 5 developers
		// Only 1 PM will be a registered
		
		Scanner s = new Scanner(System.in);
		int addMoreLoop = 1;
		System.out.println("[1] Developer | [2] Project Manager");
		System.out.print("Response: ");
		int response = s.nextInt();
		s.nextLine();
		System.out.println(maxDevs);
		System.out.println("REGISTRATION");
		
		

		if(response == 1) {
			while(addMoreLoop != 0) {
				if(maxDevs <= 5) {
					System.out.print(maxDevs);
					System.out.print("Username: ");
					String username = s.nextLine();
					System.out.print("Password: ");
					String password = s.nextLine();
					System.out.print("Name: ");
					String name = s.nextLine();
					for(int i = 1; i <= maxDevs; i++) {
							if(developer[i-1] != null) {
								if(username.equals(developer[i-1].getUsername())){
									System.out.println("Username already exists.");
									return;
								}
							}
					}
					for(int i = maxDevs; i <= maxDevs; i++) {
						if(developer[i-1] == null) {
							System.out.print(maxDevs);
							developer[i-1] = new Developer(name);
							developer[i-1].setUsername(username);
							developer[i-1].setUserPass(password);
							developer[i-1].setIDNum(idNumber);
							developer[i-1].setUserType(1);
							System.out.println("User is added.");
							break;
						}
					}
					
					System.out.println("Would you like to add more user? [1] Yes | [2] No");
					System.out.print("Response: ");
					addMoreLoop = s.nextInt();
					s.nextLine();
					if(addMoreLoop == 1) {
						maxDevs++;
					}else {
						break;
					}
				}else {
					System.out.println("Max number of developers registered.");
				}
				
			}
			
			
		}else if(response == 2) {
			if(maxPMs > 0) {
				System.out.print("Username: ");
				String username = s.nextLine();
				System.out.print("Password: ");
				String password = s.nextLine();
				System.out.print("Name: ");
				String name = s.nextLine();
				PM = new ProjectManager(name);
				PM.setUsername(username);
				PM.setUserPass(password);
				PM.setIDNum(idNumber);
				PM.setUserType(2);
				System.out.println("User is added.");
				maxPMs--;
			}else {
				System.out.println("Only 1 project manager are allowed to be registered.");
			}
			
		}
			
		
	}
	
	public static void login() { 
		
		// login method by Clever Monteros: checks if user input already exist in the developer array
		
		System.out.println("-=-=-=-=-=-LOGIN-=-=-=-=-=-");
		
		Scanner s = new Scanner(System.in);
		System.out.println("Login as: [1] Developer | [2] Project Manager");
		System.out.print("Response: ");
		int response = s.nextInt();
		s.nextLine();
		if(response == 1) {
			if(maxDevs == 0) {
				System.out.println("Please register first!");
			}else {
				System.out.print("Username: ");
				String username = s.nextLine();
				System.out.print("Password: ");
				String password = s.nextLine();
				
				for(int i = 1; i <= maxDevs; i++) {
					System.out.println(developer[i-1].getUsername());
					System.out.println(developer[i-1].getUserPass());
					System.out.println(username);
					System.out.println(password);
					if(username.equals(developer[i-1].getUsername())) {
						if(password.equals(developer[i-1].getUserPass())) {
							isLoggedIn = true;
							break;
						}
					}
				}
				
				if(isLoggedIn == false) {
					System.out.println("Username and Password doesn't match.");
				}
			}
			
		}
		
		
		
		
		
	}
	
	

}
