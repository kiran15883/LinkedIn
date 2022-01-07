package observer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class User extends UserDetails implements Login {

	int flag = 0;
	String userEmail, pass;

	@Override
	public void giveAccountDetails() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));

			System.out.println("Enter the UserName :");
			String username = br.readLine();
			
			System.out.println("Enter the Email :");
			while (flag == 0) {
				
				userEmail = br.readLine();
				if (isValid(userEmail)) {
					flag = 1;
					break;
				}
				System.out.println("Email Incorrect");
				System.out.println("Enter the Email :");
			}

			flag = 0;
			System.out.println("Enter the password :");
			while (flag == 0) {
				pass = br.readLine();
				if (isValidPassword(pass)) {
					flag = 1;
					break;
				}
				System.out.println("Password Incorrect");
				System.out.println("Enter the password :");
				
			}
          
			setName(username);
			setEmail(userEmail);
			setPassword(pass);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean isValid(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@"
				+ "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";

		Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			return false;
		return pat.matcher(email).matches();
	}

	public static boolean isValidPassword(String password) {
		String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])"
				+ "(?=.*[!@#$%^&+=])" + "(?=\\S+$).{8,20}$";
		Pattern p = Pattern.compile(regex);
		if (password == null) {
			return false;
		}
		Matcher m = p.matcher(password);
		return m.matches();
	}

	@Override
	public String getLogin() {
		String Name = getName();
		String Email = getEmail();
		return ("The Account of " + Name + " with " + Email + " is valid and authenticated");
	}

}
