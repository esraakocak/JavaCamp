package eTrade;

import business.abstracts.UserService;
import business.concretes.UserManager;
import core.jLoggerManagerAdapter;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {
	
	public static void main(String[] args) {
		
		User user1 = new User(2 , "esra ","koçak" ,"esra1kocak@gmail.com" , "456987");
		UserService userService= new UserManager(new HibernateUserDao(), new jLoggerManagerAdapter() );
		
		   userService.register(user1);
		   userService.log_in(user1.geteMail(), user1.getPassword());
		   
		
		
	}

}
