package main;

import java.util.ArrayList;
import java.util.Scanner;
import main.User;



public class main {
	
	public static int idnumber;
	
	public static int registerUser() { // By Clever Monteros: method for user registration.
		ArrayList<User> Users = new ArrayList<User>();
		Scanner s = new Scanner(System.in);
		int num_developers = 1;
		System.out.println("[1] to register as Developer\n[2] to register as Project Manager");
		int userTypeResp = s.nextInt();
		s.nextLine();
		if (userTypeResp == 1) {
			for (int i = 0; i < num_developers; i++) {
				if(num_developers > 5) {
					System.out.print("Error: Max number of developers registered!");
					break;
				}else {
					
					try {
					    Users.get(i);
					} catch (IndexOutOfBoundsException e) {
						User user = new User();

					    System.out.print("First Name: ");
					    String fname = s.nextLine();
					    System.out.print("Last Name: ");
					    String lname = s.nextLine();
					    System.out.print("Username: ");
					    String username = s.nextLine();
					    System.out.print("Password: ");
					    String userpass = s.nextLine();

					    
					    user.setFname(fname);
					    user.setLname(lname);
					    user.setUserName(username);
					    user.setUserPass(userpass);
					    user.setUserID(idnumber);
					    idnumber++;

					    System.out.println("Current Player \n" + user);
					    Users.add(user);
					    s.nextLine(); // clear the buffer
					}
					
				}
  
			}
			num_developers++;
			return 1;
		}else {
			return 0;
		}
		
	}
	
	public static void main(String[] args) { // Display and ask user for registration or login.
		idnumber = 1;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Welcome!");
		System.out.println("[1] to Register | [2] to Login");
		int response = s.nextInt();
		s.nextLine(); 

		if(response == 1) {
			
			registerUser();
					
		}

			

			do {
				
				System.out.println("Would you like to add another user? [1] Yes | [2] No");
				response = s.nextInt();
				if(response == 2) {
					break;
				}
				System.out.println(response);
				s.nextLine();
				registerUser();
				
			}while(response == 1);
			
			

	  }
	
	

}
