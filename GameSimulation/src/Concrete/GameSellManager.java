package Concrete;

import Abstract.GameSellService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class GameSellManager implements GameSellService{
	
	
	@Override
	public void normalSale(Game game, Player player) {
		
		  System.out.println("Hey :"+player.firstName+ " "+game.GameName+"you bought this game"+"and price"+game.Price);
		
	}

	@Override
	public void saleWithCampaign(Game game, Player player, Campaign campaign) {
		System.out.println("hey "+player.firstName+" "+campaign.CampaignType+""+"using this campaign"+""+"the new price you will pay"+game.Price);
		
	}
	
	

}
