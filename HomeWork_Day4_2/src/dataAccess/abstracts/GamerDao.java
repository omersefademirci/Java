package dataAccess.abstracts;

import entities.conctretes.Gamer;

public interface GamerDao {
	void add(Gamer gamer);
	void delete(Gamer gamer);
	void update(Gamer gamer);

}
