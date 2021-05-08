package business.controls;

public class NameControls {

	
	  public boolean nameControls (String firstName, String lastName) {
		  if((firstName.length()>=2)&&(lastName.length()>=2)) {
				return true;
			}
			System.out.println("The entered name and surname must contain at least two characters.");
			return false;
		} 
	  }

