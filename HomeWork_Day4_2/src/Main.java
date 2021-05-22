import java.time.LocalDate;

import business.conctretes.GameManager;
import business.conctretes.GamerManager;
import business.conctretes.SaleManager;
import core.conctretes.MernisServiceAdapter;
import dataAccess.conctretes.PortqeGameDao;
import dataAccess.conctretes.PortqeGamerDao;
import entities.conctretes.Campaign;
import entities.conctretes.Game;
import entities.conctretes.Gamer;
import entities.conctretes.Sale;

public class Main {

	public static void main(String[] args) {
		Gamer gamer =new Gamer(1,"Ömer Sefa","Demirci","29149789324",LocalDate.of(2001, 03, 26));
		GamerManager gamerManager=new GamerManager(new MernisServiceAdapter(), new PortqeGamerDao());
		gamerManager.add(gamer);
		
		Game game=new Game();
		game.setGameId(1);
		game.setGameName("Mound & Blade :Bannerlord");
		game.setGamePrice(90);
		game.setGamer(gamer);
		game.setId(1);
		
		GameManager gameManager=new GameManager(new PortqeGameDao());
		gameManager.add(game);
		
		Campaign campaign=new Campaign();
		campaign.setCampaginPriceRatio(15);
		campaign.setCampaignName("Yaz Sezonu");
		campaign.setId(1);
		
		
		Sale sale1=new Sale(1,game,gamer);
		SaleManager saleManager=new SaleManager();
		saleManager.add(sale1);
		saleManager.add(sale1, campaign);
		
		
		
			
	


	}
}
