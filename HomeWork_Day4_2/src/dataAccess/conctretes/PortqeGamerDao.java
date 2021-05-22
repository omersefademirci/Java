package dataAccess.conctretes;

import dataAccess.abstracts.GamerDao;
import entities.conctretes.Gamer;

public class PortqeGamerDao implements GamerDao {

	@Override
	public void add(Gamer gamer) {
		System.out.println("Kullan�c� veritaban�na eklendi : "+gamer.getFirstName()+" "+gamer.getLastName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kullan�c� veritaban�ndan silindi : "+gamer.getFirstName()+" "+gamer.getLastName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Kullan�c� veritaban�nda  g�ncellendi : "+gamer.getFirstName()+" "+gamer.getLastName());
		
	}

}
