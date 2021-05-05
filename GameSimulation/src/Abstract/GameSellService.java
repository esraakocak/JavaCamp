package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface GameSellService {
	
	 void normalSale(Game game,Player player);
	 void saleWithCampaign(Game game , Player player , Campaign campaign);

}
