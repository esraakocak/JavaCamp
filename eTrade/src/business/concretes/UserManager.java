package business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.UserService;
import business.controls.EmailControls;
import business.controls.NameControls;
import business.controls.PasswordControls;
import core.LoggerService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager  implements UserService {
	
	
	private UserDao userDao;
	private LoggerService loggerService;
	


	public UserManager(UserDao userDao, LoggerService loggerService) {
		super();
		this.userDao = userDao;
		this.loggerService = loggerService;
	}

	@Override
	public void register(User user) {
		System.out.println(user.geteMail()+ " " +user.getFirstName()+ " " +user.getLastName()+ " " +user.getPassword());
		if((emailControls(user.geteMail())) && (nameControls(user.getFirstName(), user.getLastName())&&(passwordControls(user.getPassword())))) {
	    	   sendMail(user);
			   checkIfValid();
			   userDao.add(user);
	       }
		 
		
	}



	@Override
	public void sendMail(User user) {
		 System.out.println(user.geteMail()+ "email sent");
		
	}

	@Override
	public void log_in(String eMail, String password) {
		  
		
	}

	@Override
	public void checkIfValid() {
		 System.err.println("verification link approved");
		
	}

	
	 public boolean emailControls(String eMail) {
			String emailcontrol = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
	        Pattern emailPath = Pattern.compile(emailcontrol, Pattern.CASE_INSENSITIVE);
	        Matcher matcher =emailPath.matcher(eMail);
	        if(matcher.find()==false){
	            System.out.println("The e-mail address you entered is not correct. Try another email");
	            
	        }
	        return  true;
		}
	 
	  public boolean nameControls (String firstName, String lastName) {
		  if((firstName.length()>=2)&&(lastName.length()>=2)) {
				return true;
			}
			System.out.println("The entered name and surname must contain at least two characters.");
			return false;
		} 
	  public boolean passwordControls (String password) {
		   if(password.length() >=6) {
			   return true;
		   } else {
			   System.out.println("You entered the wrong password.");
			   return false;
		   }
} }
