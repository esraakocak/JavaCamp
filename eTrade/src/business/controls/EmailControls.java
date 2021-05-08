package business.controls;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailControls {

	 public boolean emailControls(String eMail) {
			String emailcontrol = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
	        Pattern emailPath = Pattern.compile(emailcontrol, Pattern.CASE_INSENSITIVE);
	        Matcher matcher =emailPath.matcher(eMail);
	        if(matcher.find()==false){
	            System.out.println("The e-mail address you entered is not correct. Try another email");
	            
	        }
	        return  true;
		}
	 }
	  

