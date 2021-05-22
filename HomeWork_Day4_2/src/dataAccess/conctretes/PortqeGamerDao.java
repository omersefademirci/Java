package dataAccess.conctretes;

import dataAccess.abstracts.GamerDao;
import entities.conctretes.Gamer;

public class PortqeGamerDao implements GamerDao {

	@Override
	public void add(Gamer gamer) {
		System.out.println("Kullanýcý veritabanýna eklendi : "+gamer.getFirstName()+" "+gamer.getLastName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kullanýcý veritabanýndan silindi : "+gamer.getFirstName()+" "+gamer.getLastName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Kullanýcý veritabanýnda  güncellendi : "+gamer.getFirstName()+" "+gamer.getLastName());
		
	}

}
