package Concrete;

import Abstract.PlayerCheckService;
import Abstract.UserCheckService;
import Entities.Player;


public class UserCheckManager implements UserCheckService {

	@Override
	public void save(Player player) {
		if(PlayerCheckService.CheckPerson(player)) {
			System.out.println("player : Validation successfull.");
			
		}else {
			System.out.println("player : Validation Error - Not a valid person.");
		}
		
	}

	@Override
	public boolean CheckRealPerson(Player entity) {
		// TODO Auto-generated method stub
		return false;
	}


	
	 


		
	}
