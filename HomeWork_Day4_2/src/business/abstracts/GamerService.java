package business.abstracts;

import entities.conctretes.Gamer;

public interface GamerService {
	void add(Gamer gamer);
	void delete(Gamer gamer);
	void update(Gamer gamer);

}
