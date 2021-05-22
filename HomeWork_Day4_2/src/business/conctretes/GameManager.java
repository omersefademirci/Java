package business.conctretes;

import business.abstracts.GameService;
import dataAccess.abstracts.IGameDao;
import entities.conctretes.Game;

public class GameManager implements GameService {
	
	private IGameDao ýGameDao;
	
	public GameManager(IGameDao iGameDao) {
		
		ýGameDao = iGameDao;
	}
	
	@Override
	public void add(Game game) {
		if(!(game.getGameName()=="") && !(game.getGamePrice()==0) && !(game.getGameId()==0) && !(game.getId()==0) && !(game.getGamer()==null)) {
			ýGameDao.add(game);
		}else {
			System.out.println("Hatalý Giriþ Kontrol Edin");
		}
		
	}

	

	@Override
	public void delete(Game game) {
		if(!(game.getGameName()=="") && !(game.getGamePrice()==0)&& !(game.getGameId()==0) && !(game.getId()==0) && !(game.getGamer()==null)) {
			ýGameDao.add(game);
		}else {
			System.out.println("Hatalý Giriþ Kontrol Edin");
		}
		
	}

	@Override
	public void update(Game game) {
		if(!(game.getGameName()=="") && !(game.getGamePrice()==0)&& !(game.getGameId()==0) && !(game.getId()==0) && !(game.getGamer()==null)) {
			ýGameDao.add(game);
		}else {
			System.out.println("Hatalý Giriþ Kontrol Edin");
		}
		
	}
	

}
