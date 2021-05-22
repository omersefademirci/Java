package dataAccess.abstracts;

import entities.conctretes.Game;

public interface IGameDao {
	void add(Game game);
	void delete(Game game);
	void update(Game game);
	
}
