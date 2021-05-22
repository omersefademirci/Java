package business.abstracts;

import entities.conctretes.Game;

public interface GameService {
	
	void add(Game game);
	void delete(Game game);
	void update(Game game);

}
