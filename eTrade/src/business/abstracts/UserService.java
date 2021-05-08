package business.abstracts;



import entities.concretes.User;

public interface UserService {
	public void register(User user);
	public void sendMail(User user);
	public void log_in(String eMail , String password);
	public void checkIfValid();
	
	
	

}
