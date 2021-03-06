package dataAccess.conctretes;

import dataAccess.abstracts.GamerDao;
import entities.conctretes.Gamer;

public class PortqeGamerDao implements GamerDao {

	@Override
	public void add(Gamer gamer) {
		System.out.println("Kullanıcı veritabanına eklendi : "+gamer.getFirstName()+" "+gamer.getLastName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kullanıcı veritabanından silindi : "+gamer.getFirstName()+" "+gamer.getLastName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Kullanıcı veritabanında  güncellendi : "+gamer.getFirstName()+" "+gamer.getLastName());
		
	}

}
