package business.controls;

public class PasswordControls {

	  public boolean passwordControls (String password) {
		   if(password.length() >=6) {
			   return true;
		   } else {
			   System.out.println("You entered the wrong password.");
			   return false;
		   }
	  }
}
