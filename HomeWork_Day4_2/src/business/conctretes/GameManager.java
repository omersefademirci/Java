package business.conctretes;

import business.abstracts.GameService;
import dataAccess.abstracts.IGameDao;
import entities.conctretes.Game;

public class GameManager implements GameService {
	
	private IGameDao �GameDao;
	
	public GameManager(IGameDao iGameDao) {
		
		�GameDao = iGameDao;
	}
	
	@Override
	public void add(Game game) {
		if(!(game.getGameName()=="") && !(game.getGamePrice()==0) && !(game.getGameId()==0) && !(game.getId()==0) && !(game.getGamer()==null)) {
			�GameDao.add(game);
		}else {
			System.out.println("Hatal� Giri� Kontrol Edin");
		}
		
	}

	

	@Override
	public void delete(Game game) {
		if(!(game.getGameName()=="") && !(game.getGamePrice()==0)&& !(game.getGameId()==0) && !(game.getId()==0) && !(game.getGamer()==null)) {
			�GameDao.add(game);
		}else {
			System.out.println("Hatal� Giri� Kontrol Edin");
		}
		
	}

	@Override
	public void update(Game game) {
		if(!(game.getGameName()=="") && !(game.getGamePrice()==0)&& !(game.getGameId()==0) && !(game.getId()==0) && !(game.getGamer()==null)) {
			�GameDao.add(game);
		}else {
			System.out.println("Hatal� Giri� Kontrol Edin");
		}
		
	}
	

}
