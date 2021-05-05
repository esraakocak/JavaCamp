package Concrete;

import Abstract.PlayerService;
import Abstract.UserCheckService;
import Entities.Player;

public class PlayerManager implements PlayerService {
	
      UserCheckService checkService;
	
	public PlayerManager(UserCheckService checkService) {
		this.checkService=checkService;
	}
	
	public void add(Player entity) {
		if (checkService.CheckRealPerson(entity)) {
			System.out.println("you have successfully registered :) .");
		}
		else {
			System.out.println("try again.");
		}

	}}
