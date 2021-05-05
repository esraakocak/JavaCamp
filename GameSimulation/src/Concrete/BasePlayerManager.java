package Concrete;

import Abstract.PlayerService;
import Entities.Player;

public abstract class BasePlayerManager implements PlayerService{
	
	
	public void save(Player player) {
		System.out.println("the player is added to the system :" +player.firstName);
	}
	
	public void delete(Player player) {
		System.out.println("the player has been deleted from the system :" +player.firstName);
	}
	
	public void update(Player player) {
		System.out.println("information is updated :");
	}

}
