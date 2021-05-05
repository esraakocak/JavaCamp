import java.util.GregorianCalendar;


import Concrete.PlayerManager;
import Concrete.UserCheckManager;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
	
		Player player = new Player();
		  player.setId(1);
		  player.setFirstName("esra");
		  player.setLastName("koçak");
		  player.setNationalityId("2222222");
		  player.setDateOfBirth(new GregorianCalendar(1997,5,15).getTime());
		 
		  
	
		  PlayerManager playerManager = new PlayerManager(new UserCheckManager());
		  playerManager.add(player);
		
	} 

	}


