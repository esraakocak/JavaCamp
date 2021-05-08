package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDao {
     
	void add(User user);
	void delete(User user);
	void update(User user);
	User get(int id);
	User getByMail(String eMail);
	List<User> getAll();
	
}
