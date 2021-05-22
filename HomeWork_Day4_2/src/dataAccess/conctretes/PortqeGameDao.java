package dataAccess.conctretes;

import dataAccess.abstracts.IGameDao;
import entities.conctretes.Game;

public class PortqeGameDao implements IGameDao{

	@Override
	public void add(Game game) {
		System.out.println("Oyun veritaban�na eklendi : \n\t"+
							"Id : "+game.getId()+
							"\n\tGame Id : "+game.getGameId()+
							"\n\tGame Name :  "+game.getGameName() +
							"\n\tGame Price :  "+game.getGamePrice());
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun veritaban�ndan silindi : \n\t"+
							"Id : "+game.getId()+
							"\n\t : "+game.getGameId()+
							"\n\t : "+game.getGameName()+
							"\n\t : "+game.getGamePrice());
							
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun veritaban�nda g�ncellendi : \n\t"+
				"Id : "+game.getId()+
				"\n\t : "+game.getGameId()+
				"\n\t : "+game.getGameName()+
				"\n\t : "+game.getGamePrice());
		
		
	}
	

}
